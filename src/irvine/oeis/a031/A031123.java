package irvine.oeis.a031;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031123 Expansion of Sum_{m&gt;=1} z^(m^2)/(1-z^((m+1)^2)).
 * @author Sean A. Irvine
 */
public class A031123 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> f = RING.zero();
    for (int k = 1; k * k <= mN; ++k) {
      f = RING.add(f, RING.series(RING.monomial(Z.ONE, k * k), RING.oneMinusXToTheN((k + 1) * (k + 1)), mN));
    }
    return f.coeff(mN);
  }
}

