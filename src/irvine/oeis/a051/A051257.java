package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051257 Numbers formed from binomial coefficients (mod 2+k) interpreted as digits in factorial base.
 * @author Sean A. Irvine
 */
public class A051257 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      f = f.multiply(k + 1);
      sum = sum.add(f.multiply(Binomial.binomial(mN, k).mod(2 + k)));
    }
    return sum;
  }
}
