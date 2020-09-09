package irvine.oeis.a034;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A034853.
 * @author Sean A. Irvine
 */
public class A034853 extends A034781 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 2;
  private int mD = 2;

  private Polynomial<Z> r(final int diameter, final int n) {
    final Z[] r = new Z[n + 1];
    for (int k = 0; k < r.length; ++k) {
      r[k] = t(k, diameter);
    }
    return Polynomial.create(r);
  }

  private Z s(final int points, final int h) {
    if (points <= 1) {
      return Z.valueOf(points);
    }
    Z s = Z.ZERO;
    for (int k = 0; k <= h; ++k) {
      s = s.add(t(points, k));
    }
    return s;
  }

  private Polynomial<Z> sx(final int diameter, final int n) {
    final Z[] s = new Z[n + 1];
    for (int k = 0; k < s.length; ++k) {
      s[k] = s(k, diameter);
    }
    return Polynomial.create(s);
  }

  private Z d(final int points, final int diameter) {
    final int d = diameter / 2;
    if ((diameter & 1) == 0) {
      return RING.subtract(r(d, points), RING.multiply(r(d - 1, points), sx(d - 1, points), points)).coeff(points);
    } else {
      return RING.add(RING.pow(r(d, points), 2, points), r(d, points / 2).substitutePower(2, points)).coeff(points).divide2();
    }
  }

  @Override
  public Z next() {
    if (++mD >= mN) {
      ++mN;
      mD = 2;
    }
    return d(mN, mD);
  }
}
