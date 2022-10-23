package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051255 Number of cyclically symmetric transpose complement plane partitions in a 2n X 2n X 2n box.
 * @author Sean A. Irvine
 */
public class A051255 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(Binomial.binomial(6 * k, 2 * k).multiply(3 * k + 1));
    }
    for (long k = 0; k < mN; ++k) {
      prod = prod.divide(Binomial.binomial(4 * k + 1, 2 * k).multiply(2 * k + 1));
    }
    return prod;
  }
}
