package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;

/**
 * A002290.
 * @author Sean A. Irvine
 */
public class A002290 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Z> a = RING.pow(RING.oneMinusXToTheN(2 * k), 6, mN);
      final Polynomial<Z> b = RING.oneMinusXToTheN(k);
      final Polynomial<Z> c = RING.pow(RING.oneMinusXToTheN(4 * k), 2, mN);
      final Polynomial<Z> d = RING.multiply(b, c, mN);
      p = RING.multiply(p, RING.pow(RING.series(a, d, mN), 4, mN), mN);
    }
    return p.coeff(mN).abs();
  }
}
