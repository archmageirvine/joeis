package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A064696 Smallest value of s&gt;0 such that A064683(s) is divisible by n, or 0 if n belongs to A064695.
 * @author Sean A. Irvine
 */
public class A064696 extends Sequence1 implements Conjectural {

  private static final int SEARCH_LIMIT = 100;
  private final int[] mWorkspace = new int[20]; // more than enough for a long
  protected long mN = 0;

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

  @Override
  public Z next() {
    if (++mN < 10) {
      return Z.ONE;
    }
    long m = mN;
    int k = 0;
    while (m != 0) {
      mWorkspace[k++] = (int) (m % 10);
      m /= 10;
    }
    for (int s = 1; s <= SEARCH_LIMIT * mN; ++s) {
      if (is(k, s)) {
        return Z.valueOf(s);
      }
    }
    return Z.ZERO;
  }
}
