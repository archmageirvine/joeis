package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.IntegerUtils;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;

/**
 * A002653 Expansion of <code>(theta_3(z)*theta_3(7z)+theta_2(z)*theta_2(7z))^3</code>.
 * @author Sean A. Irvine
 */
public class A002653 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  private Polynomial<Z> t2(final int n) {
    Polynomial<Z> p = RING.zero();
    for (int k = 1; k <= (IntegerUtils.sqrt(4 * n + 1) + 1) / 2; ++k) {
      p = RING.add(p, RING.monomial(Z.TWO, k * k - k));
    }
    return p;
  }

  private Polynomial<Z> t3(final int n) {
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= IntegerUtils.sqrt(n); ++k) {
      p = RING.add(p, RING.monomial(Z.TWO, k * k));
    }
    return p;
  }

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    final Polynomial<Z> t3 = t3(mN);
    final Polynomial<Z> t2 = t2(mN);
    final Polynomial<Z> a = RING.multiply(t3, t3.substitutePower(7, mN), mN);
    final Polynomial<Z> b = RING.shift(RING.multiply(t2, t2.substitutePower(7, mN), mN), 2);
    final Polynomial<Z> c = RING.pow(RING.add(a, b), 3, mN);
    return c.coeff(mN);
  }
}
