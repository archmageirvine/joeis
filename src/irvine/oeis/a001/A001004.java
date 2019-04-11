package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A001004 Number of nonequivalent dissections of an (n+2)-gon by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A001004 extends A001003 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> PA = Polynomial.create(0, 0, 3);
  private static final Polynomial<Z> PB = Polynomial.create(2, 2, 7);

  private final ArrayList<Z> mCoeff = new ArrayList<>();

  {
    mCoeff.add(Z.ZERO);
    mCoeff.add(super.next());
    mCoeff.add(super.next());
  }

  @Override
  public Z next() {
    mCoeff.add(super.next());
    if (mN == 2) {
      return Z.ONE;
    }
    final Polynomial<Z> f = RING.create(mCoeff);
    final Polynomial<Z> fSquared = RING.pow(f, 2, mN);
    final Polynomial<Z> g = RING.add(RING.subtract(PB, RING.shift(RING.multiply(f, Z.FOUR), 1)), RING.multiply(fSquared, Z.TWO));
    final Polynomial<Z> u = f.substitutePower(2, mN);
    final Polynomial<Z> h = RING.multiply(g, u, mN);
    final Polynomial<Z> v = RING.multiply(RING.pow(u, 2, mN), Z.TWO);
    final Polynomial<Z> num = RING.add(RING.subtract(RING.add(RING.subtract(PA, RING.shift(RING.multiply(f, Z.TWO), 1)), fSquared), h), v);
    final Polynomial<Z> den = RING.multiply(RING.subtract(RING.multiply(u, Z.TWO), RING.one()), Z.TWO);
    final Z c = RING.coeff(num, den, mN);

    Z r = Z.ZERO;
    for (int k = 3; k <= mN; ++k) {
      Z q = Z.ZERO;
      for (int d = 1; d <= k; ++d) {
        if (k % d == 0) {
          q = q.add(RING.pow(f.substitutePower(d, mN), k / d, mN).coeff(mN).multiply(LongUtils.phi(d)));
        }
      }
      r = r.add(q.divide(k));
    }

    return c.add(r).divide(2);
  }
}
