package irvine.oeis.a385;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002144;

/**
 * A385234 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A385234 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A002144();
    Polynomial<Z> prod = RING.one();
    int p;
    while ((p = s.next().intValueExact()) <= mN) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(p));
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

