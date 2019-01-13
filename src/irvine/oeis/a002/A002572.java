package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;


/**
 * A002572.
 * @author Sean A. Irvine
 */
public class A002572 implements Sequence {

  // Based on pari code by Joerg Arndt
  // Uses g.f. as given in the Elsholtz/Heuberger/Prodinger reference

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  protected int base() {
    return 2;
  }

  private int f(final int k) {
    final int t = base();
    return (int) ((1 - Math.pow(t, k)) / (1 - t));
  }

  private Polynomial<Z> la(final int j) {
    Polynomial<Z> den = RING.one();
    int num = 0;
    for (int k = 1; k <= j; ++k) {
      final int fk = f(k);
      num += fk;
      den = RING.multiply(den, RING.oneMinusXToTheN(fk), mN);
    }
    return RING.series(RING.monomial(Z.ONE, num), den, mN);
  }

  private Polynomial<Z> numDen(final int limit) {
    Polynomial<Z> num = RING.zero();
    Polynomial<Z> den = RING.zero();
    for (int j = 0; j <= limit; ++j) {
      final int fj = f(j);
      final Polynomial<Z> laj = la(j);
      num = RING.signedAdd((j & 1) == 0, num, laj.shift(fj));
      den = RING.signedAdd((j & 1) == 0, den, laj);
    }
    return RING.series(num, den, mN);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int limit = 2 + (int) (2 * Math.ceil(Math.log(mN) / Math.log(base())));
    return numDen(limit).coeff(mN);
  }

}
