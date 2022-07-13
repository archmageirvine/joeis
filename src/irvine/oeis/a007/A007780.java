package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007780 Losing initial configurations in 2-hole Tchuka Ruma.
 * @author Sean A. Irvine
 */
public class A007780 implements Sequence {

  // Solve Tchuka Ruma solitaire with 2 holes + ruma.
  // We treat the ruma as hole 0 and remember small solutions in a cache
  // where 1 = solvable, 2 = unsolvable, and 0 means not yet computed.

  private static final int CACHE_SIZE = Integer.parseInt(System.getProperty("oeis.cache", "25000"));
  private byte[][] mCache = null;
  private long mN = 0;

  private boolean isSolvable(final long[] state, final int hole) {
    //System.out.println(Arrays.toString(state) + " " + hole);
    // If not compute it
    int h = hole;
    while (true) {
      // Take all the stones out of hole h
      long stones = state[h];
      if (stones == 0) {
        return false;
      }
      state[h] = 0;
      // Distribute the stones into subsequent holes
      final long inc = stones / 3;
      state[0] += inc;
      state[1] += inc;
      state[2] += inc;
      stones %= 3;
      while (stones != 0) {
        if (++h > 2) {
          h = 0;
        }
        ++state[h];
        --stones;
      }
      if (h == 0) {
        // Last stone was placed in the ruma, we are free to pick either of the other
        // two holes as the next starting point.
        // Make a copy of the state so that it is not disturbed for the other possibility
        return isSolvable(state);
      }
      if (state[h] < 2) {
        // There were not sufficient stones in the hole
        return false;
      }
    }
  }

  private void setCache(final long a, final long b, final byte v) {
    if (a < mCache.length && b < mCache.length) {
      mCache[(int) a][(int) b] = v;
    }
  }

  private boolean isSolvable(final long[] state) {
    // Have we won
    if (state[0] == 2 * mN) {
      return true;
    }
    // First see if we already have this result
    final long a = state[1];
    final long b = state[2];
    if (a < mCache.length && b < mCache.length) {
      final byte c = mCache[(int) a][(int) b];
      if (c != 0) {
        return c == 1;
      }
    }
    // If not, then compute it
    final long r = state[0];
    if (isSolvable(state, 1)) {
      setCache(a, b, (byte) 1);
      return true;
    }
    state[0] = r;
    state[1] = a;
    state[2] = b;
    if (isSolvable(state, 2)) {
      setCache(a, b, (byte) 1);
      return true;
    } else {
      setCache(a, b, (byte) 2);
      return false;
    }
  }

  private boolean isSolvable(final long n) {
    return isSolvable(new long[] {0, n, n});
  }

  @Override
  public Z next() {
    if (mCache == null) {
      mCache = new byte[CACHE_SIZE][CACHE_SIZE];
    }
    while (true) {
      if (!isSolvable(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }

}
