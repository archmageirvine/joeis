package irvine.oeis.a387;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.string.StringUtils;

/**
 * A387632 allocated for Colin Linzer.
 * @author Sean A. Irvine
 */
public class A387632 extends Sequence2 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Integer> mA = new TreeSet<>();
  private int mN = 1;

  private boolean ok(final long[] s, final int pos, final long v) {
    for (int k = 0; k < pos; ++k) {
      if (Long.bitCount(s[k] & v) > 1) {
        return false;
      }
    }
    return true;
  }

  private boolean checkPair(final long[] s, final int pos, final long pair) {
    for (int k = 0; k < pos; ++k) {
      if ((s[k] & pair) == pair) {
        return true;
      }
    }
    return false;
  }

  private boolean check(final long[] s, final int pos, final long lim) {
    for (long pair = 3; pair < lim; pair = Functions.SWIZZLE.l(pair)) {
      if (!checkPair(s, pos, pair)) {
        return false;
      }
    }
    return true;
  }

  private boolean search(final long[] sets, final int pos, final long used, final long lim, final long next) {
    if (next >= lim) {
      if (check(sets, pos, lim)) {
        //System.out.println("n=" + mN + " k=" + Long.bitCount(sets[0]) + " size=" + pos + " " + Long.toBinaryString(used) + " " + Arrays.toString(Arrays.copyOf(sets, pos)));
        mA.add(pos);
        return true; // No need to search further
      }
      return false;
    }
    // WLOG the next subset should include only values less than least unused or the least unused
    // Find the least unused number
    long wlogBit = 1L;
    while ((used & wlogBit) != 0) {
      wlogBit <<= 1;
    }
    // Search
    for (long s = next; s < lim; s = Functions.SWIZZLE.l(s)) {
      if ((s < wlogBit || (s & wlogBit) != 0) && ok(sets, pos, s)) {
        sets[pos] = s;
        if (search(sets, pos + 1, used | s, lim, Functions.SWIZZLE.l(s))) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      final long pairs = Functions.TRIANGULAR.l(mN - 1);
      final long lim = 1L << mN;
      final long[] set = new long[1000];
      for (long k = 2; k <= mN; ++k) {
        if (pairs % Functions.TRIANGULAR.l(k - 1) != 0) {
          continue;
        }
        if ((mN - 1) % (k - 1) != 0) {
          continue;
        }
        if (k < mN) {
          final long b = pairs / Functions.TRIANGULAR.l(k - 1);
          if (b < mN) {
            continue;
          }
        }
        if (pairs % Functions.TRIANGULAR.l(k - 1) == 0) {
          if (mVerbose) {
            StringUtils.message("Starting search for n=" + mN + " sets of size " + k);
          }
          search(set, 0, 0, lim, (1L << k) - 1);
        }
      }
    }
    return Z.valueOf(mA.pollLast());
  }
}
