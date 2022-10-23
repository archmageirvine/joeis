package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000991 Number of 3-line partitions of n.
 * @author Sean A. Irvine
 */
public class A000991 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = Polynomial.create(1, -1, -2, 2, 1, -1); // (1-x)(1-x^2)^2
    for (int m = 3; m <= mN; ++m) {
      final Polynomial<Z> p = RING.oneMinusXToTheN(m);
      prod = RING.multiply(prod, RING.pow(p, 3, mN), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

