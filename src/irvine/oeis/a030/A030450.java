package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030450 Related to number of elements in the free band (idempotent semigroup) on n generators.
 * @author Sean A. Irvine
 */
public class A030450 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(mN - k + 1).pow(Z.ONE.shiftLeft(k)));
    }
    return prod;
  }
}
