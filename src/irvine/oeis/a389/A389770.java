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
 * A389770 allocated for Hamidreza Maleki Tirabadi.
 * @author Sean A. Irvine
 */
public class A389770 extends AbstractSequence implements DirectSequence {

  // See A389766 for a description of the code here

  // This value is tuned for -Xmx40g
  private static final int USE_DISK_THRESHOLD = 100000000;
  private static final File DISK_FILE = new File("a389766.dat");

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 11;

  /** Construct the sequence. */
  public A389770() {
    super(12);
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
    if (4 * n > Long.SIZE) {
      throw new UnsupportedOperationException();
    }

    final long rowMask = (1L << n) - 1;
    final int[] attackMasks = new int[n];
    for (int k = 0; k < n; ++k) {
      attackMasks[k] = (int) (((0b111L << k) >>> 1) & rowMask);
    }

    // Precompute possible arrangements for a particular row
    // We use 3-bits for each count, so we have a clear bit to detect columns > 3
    // With a more expensive check in the core look we could reduce this number to 2 bits
    final int[] forbidden = new int[(n - 2) * (n - 3) * (n - 4) / 6];
    final int[] blocked = new int[forbidden.length];
    final long[] colAdd = new long[forbidden.length];
    final long[] colMask = new long[forbidden.length];
    for (int firstKing = 0, k = 0; firstKing < n - 4; ++firstKing) {
      for (int secondKing = firstKing + 2; secondKing < n - 2; ++secondKing) {
        for (int thirdKing = secondKing + 2; thirdKing < n; ++thirdKing, ++k) {
          forbidden[k] = (1 << firstKing) | (1 << secondKing) | (1 << thirdKing);
          blocked[k] = attackMasks[firstKing] | attackMasks[secondKing] | attackMasks[thirdKing];
          colAdd[k] = (1L << (3 * firstKing)) + (1L << (3 * secondKing)) + (1L << (3 * thirdKing));
          colMask[k] = (3L << (3 * firstKing)) + (3L << (3 * secondKing)) + (3L << (3 * thirdKing));
        }
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
              if ((u & ~colMask[k]) == 0) { // Checks no column count is now 4
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
                if ((u & ~colMask[k]) == 0) { // i.e., no count overflowed 3
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
    System.out.println(new A389770().a(Integer.parseInt(args[0])));
  }
}
