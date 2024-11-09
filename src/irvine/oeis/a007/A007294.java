package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A007294 Number of partitions of n into nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A007294 extends Sequence0 implements DirectSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Polynomial<Z> den = RING.one();
    int p;
    int k = 1;
    while ((p = Binomial.binomial(++k, 2).intValueExact()) <= n) {
      den = RING.multiply(den, RING.oneMinusXToTheN(p), n);
    }
    return RING.coeff(RING.one(), den, n);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
