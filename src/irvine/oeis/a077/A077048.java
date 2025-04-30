package irvine.oeis.a077;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077048.
 * @author Sean A. Irvine
 */
public class A077048 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Polynomial<Z> g = RING.zero();
    final int m = mN * mN / 2;
    final Polynomial<Z> s = RING.series(RING.oneMinusXToTheN(mN).shift(1), RING.oneMinusXToTheN(1), m);
    for (int k = 1; k <= mN; ++k) {
      g = RING.add(g, RING.pow(s, k, m));
    }
    return g.coeff(m);
  }
}

