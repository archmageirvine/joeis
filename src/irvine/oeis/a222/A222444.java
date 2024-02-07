package irvine.oeis.a222;

import irvine.math.z.Z;
import irvine.oeis.a068.A068254;

/**
 * A222444 T(n,k) = number of n X k 0..3 arrays with entries increasing mod 4 by 0, 1 or 2 rightwards and downwards, starting with upper left zero.
 * @author Sean A. Irvine
 */
public class A222444 extends A068254 {

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
