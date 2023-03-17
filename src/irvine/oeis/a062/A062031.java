package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062031 Group odd numbers into (1), (3,5,7), (9,11,13,15,17), ...; a(n) = product of n-th group.
 * @author Sean A. Irvine
 */
public class A062031 extends Sequence1 {

  private long mN = -1;
  private long mM = -1;

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
