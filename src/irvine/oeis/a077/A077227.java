package irvine.oeis.a077;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077227 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, -1);
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return m * m < n ? Z.ZERO : RING.coeff(RING.pow(RING.oneMinusXToTheN(m), m, n - m), RING.pow(C, m, n - m), n - m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

