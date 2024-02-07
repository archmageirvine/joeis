package irvine.oeis.a222;

import irvine.math.z.Z;
import irvine.oeis.a068.A068256;

/**
 * A222281 T(n,k) = number of n X k 0..5 arrays with no entry increasing mod 6 by 5 rightwards or downwards, starting with upper left zero.
 * @author Sean A. Irvine
 */
public class A222281 extends A068256 {

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
}
