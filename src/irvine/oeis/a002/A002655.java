package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;

/**
 * A002655 Expansion of <code>Product_{i &gt;= 1} (1-q^i)(1-q^{7i})</code>.
 * @author Sean A. Irvine
 */
public class A002655 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.multiply(RING.oneMinusXToTheN(k), RING.oneMinusXToTheN(7 * k), mN), mN);
    }
    return p.coeff(mN);
  }
}
