package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077544 Product of next n numbers + sum of next n numbers.
 * @author Sean A. Irvine
 */
public class A077544 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(++mM);
      sum = sum.add(mM);
    }
    return prod.add(sum);
  }
}
