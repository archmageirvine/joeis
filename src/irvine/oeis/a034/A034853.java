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
    //r[0] = Z.ZERO;
    for (int k = 0; k < r.length; ++k) {
      r[k] = t(k, diameter);
    }
    return Polynomial.create(r);
  }

  private Z s(final int points, final int h) {
    Z s = Z.ZERO;
    for (int k = 1; k <= h; ++k) {
      s = s.add(t(points, k));
    }
    return s;
  }

  private Polynomial<Z> sx(final int diameter, final int n) {
    final Z[] s = new Z[n + 1];
    s[0] = Z.ZERO;
    for (int k = 1; k < s.length; ++k) {
      s[k] = s(k, diameter);
    }
    return Polynomial.create(s);
  }

  private Z d(final int points, final int diameter) {
    // todo odd d case looks to be working, even is not right
    // todo I think is is s or sx that is wrong
    final int d = diameter / 2;
    if ((diameter & 1) == 0) {
      //return Z.ONE.max(RING.subtract(r(d, points), RING.multiply(r(d - 1, points), sx(d - 1, points), points)).coeff(points).subtract(1));
      return RING.subtract(r(d, points), RING.multiply(r(d - 1, points), sx(d - 1, points).shift(-1), points)).coeff(points - 1);
      //return Z.ONE.max(RING.subtract(r(d, points), RING.multiply(r(d - 1, points), sx(d - 1, points), points)).coeff(points).divide2());
    } else {
      return RING.add(RING.pow(r(d, points), 2, points), r(d, points).substitutePower(2, points)).coeff(points).divide2();
    }
  }

  @Override
  public Z next() {
    int d=4;
    for (int p = 3; p < 20; ++p) {
      System.out.println("T(" + p + "," + d + ")=" + d(p, d));
    }


    //System.out.println("R7: " + r(7, 20));
    //System.out.println("S3: " + sx(3, 15));
    if (++mD >= mN) {
      ++mN;
      mD = 2;
    }
    System.out.println("(" + mN + "," + mD + ")");
    return d(mN, mD);
  }

}
