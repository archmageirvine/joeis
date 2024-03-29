package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062030 Group even numbers into (2,4), (6,8,10,12), (14,16,18,20,22,24), ...; a(n) = product of n-th group.
 * @author Sean A. Irvine
 */
public class A062030 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mN += 2;
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      mM += 2;
      prod = prod.multiply(mM);
    }
    return prod;
  }
}
