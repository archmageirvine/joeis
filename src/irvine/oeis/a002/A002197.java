package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;

import java.util.ArrayList;

/**
 * A002197 Numerators of coefficients for numerical integration.
 * @author Sean A. Irvine
 */
public class A002197 implements Sequence {

  private static final PolynomialRingField<Q> FIELD = new PolynomialRingField<>(Rationals.SINGLETON);

  protected int mN = -1;

  private Polynomial<Q> sqrtAsinSqrt(final int n) {
    final Polynomial<Q> p = FIELD.asin(FIELD.x(), 2 * n);
    final ArrayList<Q> coeff = new ArrayList<>();
    coeff.add(Q.ZERO);
    for (int k = 1; k <= p.degree(); k += 2) {
      coeff.add(p.coeff(k).abs());
    }
    return FIELD.create(coeff);
  }

  protected Q nextQ(final int n) {
    if (n == 0) {
      return new Q(1, 6);
    }
    final Q b = FIELD.series(FIELD.x(), sqrtAsinSqrt(n + 2), n + 2).coeff(n + 1);
    return b.abs();
  }

  @Override
  public Z next() {
    return nextQ(++mN).num();
  }
}
