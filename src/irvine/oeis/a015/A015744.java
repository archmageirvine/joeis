package irvine.oeis.a015;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015744 Number of partitions of n into distinct parts, none being 2.
 * @author Sean A. Irvine
 */
public class A015744 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int target() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int j = 1; j <= mN; ++j) {
      if (j != target()) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(j), mN);
      }
    }
    return prod.coeff(mN);
  }
}
