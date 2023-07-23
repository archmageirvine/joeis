package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A064683 Let n(s) be the number formed from n by inserting s 0's between each digit, e.g. 123(2) is 1002003; sequence gives numbers n such that n(s) is divisible by n for some s&gt;0.
 * @author Sean A. Irvine
 */
public class A064683 extends Sequence1 implements Conjectural {

  private static final int SEARCH_LIMIT = 1000;
  private final int[] mWorkspace = new int[20]; // more than enough for a long
  private long mN = 0;

  private boolean is(int k, final int zeros) {
    long v = 0;
    while (--k >= 0) {
      v += mWorkspace[k];
      v %= mN;
      if (k > 0) {
        for (int s = 0; s <= zeros; ++s) {
          v *= 10;
          v %= mN;
        }
      }
    }
    return v == 0;
  }

  private boolean is(final long n) {
    if (n < 10) {
      return true; // trivially true
    }
    long m = n;
    int k = 0;
    while (m != 0) {
      mWorkspace[k++] = (int) (m % 10);
      m /= 10;
    }
    for (int s = 1; s <= SEARCH_LIMIT; ++s) {
      if (is(k, s)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
