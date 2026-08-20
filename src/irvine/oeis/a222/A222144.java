package irvine.oeis.a222;

import irvine.math.z.Z;
import irvine.oeis.a068.A068255;
import irvine.oeis.triangle.DirectArray;

/**
 * A222144 T(n,k) = number of n X k 0..4 arrays with no entry increasing mod 5 by 4 rightwards or downwards, starting with upper left zero.
 * @author Sean A. Irvine
 */
public class A222144 extends A068255 implements DirectArray {

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
