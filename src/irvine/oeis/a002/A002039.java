package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002039 Convolution inverse of <code>A143348</code>.
 * @author Sean A. Irvine
 */
public class A002039 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(-1);

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Z> den = RING.zero();
    for (int k = 1; k <= mN + 1; ++k) {
      final boolean even = (k & 1) == 0;
      final Polynomial<Z> t = even ? RING.oneMinusXToTheN(k) : RING.onePlusXToTheN(k);
      den = RING.add(den, RING.series(RING.monomial(Z.valueOf(even ? k : -k), k - 1), t, mN + 1));
    }
    return RING.coeff(NUM, den, mN);
  }
}
