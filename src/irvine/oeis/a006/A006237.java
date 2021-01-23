package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006237 Complexity of tensor sum of n graphs; or spanning trees on n-cube.
 * @author Sean A. Irvine
 */
public class A006237 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(k).pow(Binomial.binomial(mN, k)));
    }
    return prod.shiftLeft((1 << mN) - 1 - mN);
  }
}
