package irvine.oeis.a389;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.util.string.StringUtils;

/**
 * A389766 allocated for Hamidreza Maleki Tirabadi.
 * @author Sean A. Irvine
 */
public class A389766 extends AbstractSequence implements DirectSequence {

  // We pack state information into a single long
  // The lower n bits indicate cells which are forbidden for placement on the next row
  // The next 2n bits are 2-bit counters with the number of kings in each column
  // This should enable computation as far as n=21 (since 3*21=63 < 64), but a lot
  // of memory is still required to hold all the states.
  //
  // In a further attempt to save memory, the actual count is computed modulo p<2^30
  // for as many p as necessary to get a stable answer via the Chinese remainder theorem.
  // This means counts can be stored in an int.
  //
  // Above sizes given below, this code writes the previous iteration to disk to further
  // conserve memory.

  // This value is tuned for -Xmx40g
  private static final int USE_DISK_THRESHOLD = 100000000;
  private static final File DISK_FILE = new File("a389766.dat");

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 7;

  /** Construct the sequence. */
  public A389766() {
    super(8);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  private void writeToDisk(final Map<Long, Integer> m) {
    try (final DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(DISK_FILE)))) {
      dos.writeInt(m.size());
      for (final Map.Entry<Long, Integer> e : m.entrySet()) {
        dos.writeLong(e.getKey());
        dos.writeInt(e.getValue());
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  private int a(final int n, final int p) {
    if (3 * n > Long.SIZE) {
      throw new UnsupportedOperationException();
    }

    final long rowMask = (1L << n) - 1;
    final int[] attackMasks = new int[n];
    for (int k = 0; k < n; ++k) {
      attackMasks[k] = (int) (((0b111L << k) >>> 1) & rowMask);
    }

    // Precompute possible arrangements for a particular row
    final int[] forbidden = new int[(n - 1) * (n - 2) / 2];
    final int[] blocked = new int[forbidden.length];
    final long[] colAdd = new long[forbidden.length];
    final long[] colMask = new long[forbidden.length];
    for (int firstKing = 0, k = 0; firstKing < n - 2; ++firstKing) {
      for (int secondKing = firstKing + 2; secondKing < n; ++secondKing, ++k) {
        forbidden[k] = (1 << firstKing) | (1 << secondKing);
        blocked[k] = attackMasks[firstKing] | attackMasks[secondKing];
        colAdd[k] = (1L << (2 * firstKing)) + (1L << (2 * secondKing));
        colMask[k] = (3L << (2 * firstKing)) + (3L << (2 * secondKing));
      }
    }

    Map<Long, Integer> states = Collections.singletonMap(0L, 1);
    for (int row = 0; row < n; ++row) {
      final HashMap<Long, Integer> newStates;
      if (states != null) {
        newStates = new HashMap<>(states.size() * (row < 8 ? 3 : 1)); // Try to guess the peak in size
        for (final Map.Entry<Long, Integer> e : states.entrySet()) {
          final long state = e.getKey();
          final int cnt = e.getValue();
          final int attacked = (int) (state & rowMask);
          for (int k = 0; k < forbidden.length; ++k) {
            if ((attacked & forbidden[k]) == 0) {
              final long colCounts = state >>> n;
              final long u = (colCounts & colMask[k]) + colAdd[k];
              if ((u & (u >>> 1)) == 0) { // Checks no column count is now 3
                final long t = ((colCounts + colAdd[k]) << n) + blocked[k];
                newStates.merge(t, cnt, (x, y) -> (x + y) % p);
              }
            }
          }
        }
      } else {
        try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(DISK_FILE)))) {
          final int size = dis.readInt();
          newStates = new HashMap<>(size * (row < 8 ? 3 : 1)); // Try to guess the peak in size
          for (int i = 0; i < size; ++i) {
            final long state = dis.readLong();
            final int cnt = dis.readInt();
            final int attacked = (int) (state & rowMask);
            for (int k = 0; k < forbidden.length; ++k) {
              if ((attacked & forbidden[k]) == 0) {
                final long colCounts = state >>> n;
                final long u = (colCounts & colMask[k]) + colAdd[k];
                if ((u & (u >>> 1)) == 0) { // Checks no column count is now 3
                  final long t = ((colCounts + colAdd[k]) << n) + blocked[k];
                  newStates.merge(t, cnt, (x, y) -> (x + y) % p);
                }
              }
            }
          }
        } catch (final IOException e) {
          throw new RuntimeException(e);
        }
        if (!DISK_FILE.delete()) {
          StringUtils.message("Failed to delete " + DISK_FILE);
        }
      }
      if (mVerbose) {
        StringUtils.message("n=" + n + " p=" + p + " completed row " + (row + 1) + " number of states " + newStates.size());
      }
      if (newStates.size() > USE_DISK_THRESHOLD) {
        if (mVerbose) {
          StringUtils.message("n=" + n + " p=" + p + " writing to disk");
        }
        writeToDisk(newStates);
        if (mVerbose) {
          StringUtils.message("n=" + n + " p=" + p + " finished writing");
        }
        states = null; // Release memory
      } else {
        states = newStates;
      }
    }
    int sum = 0;
    for (final int v : states.values()) {
      sum += v;
      sum %= p;
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    int p = 1 << 30; // Allow headroom of 1 bit in positive to (x + y) % p is safe
    Z[] divs = {};
    Z[] mods = {};
    Z prev = Z.ZERO;
    while (true) {
      divs = Arrays.copyOf(divs, divs.length + 1);
      mods = Arrays.copyOf(mods, mods.length + 1);
      p = Functions.PREV_PRIME.i(p);
      mods[mods.length - 1] = Z.valueOf(p);
      divs[divs.length - 1] = Z.valueOf(a(n, p));
      final Z cnt = ZUtils.chineseRemainderTheorem(divs, mods);
      if (cnt.equals(prev)) {
        return cnt;
      }
      prev = cnt;
      if (mVerbose) {
        StringUtils.message("CRT reports a count of " + cnt);
      }
    }
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  /**
   * Run a specific value.
   * @param args n
   */
  public static void main(final String... args) {
    System.out.println(new A389766().a(Integer.parseInt(args[0])));
  }
}
