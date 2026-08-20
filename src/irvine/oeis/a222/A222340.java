package irvine.oeis.a222;

import irvine.math.z.Z;
import irvine.oeis.a068.A068257;
import irvine.oeis.triangle.DirectArray;

/**
 * A222340 T(n,k) = number of n X k 0..6 arrays with no entry increasing mod 7 by 6 rightwards or downwards, starting with upper left zero.
 * @author Sean A. Irvine
 */
public class A222340 extends A068257 implements DirectArray {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }

  @Override
  public Z a(final long n, final long k) {
    return super.a(n, k);
  }

}
