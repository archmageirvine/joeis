package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;

/**
 * A002288 G.f.: q <code>* Product_{m&gt;=1} (1-q^m)^8*(1-q^2m)^8</code>.
 * @author Sean A. Irvine
 */
public class A002288 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Z> a = RING.pow(RING.oneMinusXToTheN(k), 8, mN);
      final Polynomial<Z> b = RING.pow(RING.oneMinusXToTheN(2 * k), 8, mN);
      p = RING.multiply(p, RING.multiply(a, b), mN);
    }
    return p.coeff(mN - 1);
  }
}
