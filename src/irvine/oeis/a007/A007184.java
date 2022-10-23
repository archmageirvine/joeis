package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007184 a(n) = Product_{k=0..n-1} (2^(2^k - 1) + 1)^C(n,k).
 * @author Sean A. Irvine
 */
public class A007184 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(Z.ONE.shiftLeft((1 << k) - 1).add(1).pow(Binomial.binomial(mN, k)));
    }
    return prod;
  }
}
