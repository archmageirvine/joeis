package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A086992 Product of nonzero digits in n-th row of Pascal's triangle.
 * @author Georg Fischer
 */
public class A086992 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 0; i <= mN; ++i) {
      prod = prod.multiply(ZUtils.digitNZProduct(Binomial.binomial(mN, i), 10));
    }
    return prod;
  }
}
