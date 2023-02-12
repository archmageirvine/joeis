package irvine.oeis.a061;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061396 Number of "rooted index-functional forests" (Riffs) on n nodes. Number of "rooted odd trees with only exponent symmetries" (Rotes) on 2n+1 nodes.
 * @author Sean A. Irvine
 */
public class A061396 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      Polynomial<Z> prod = RING.one();
      for (int k = 0; k < mN; ++k) {
        prod = RING.multiply(prod, RING.pow(RING.add(RING.one(), mA.shift(k + 1)), mA.coeff(k), mN), mN);
      }
      mA = prod;
    }
    return mA.coeff(mN);
  }
}

