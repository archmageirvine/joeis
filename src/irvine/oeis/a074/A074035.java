package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074035 Let a = RootOf( x^2+x+1 ) and b = 1+a. Number of degree-n irreducible polynomials over GF(4) with trace 1 and subtrace a.
 * @author Sean A. Irvine
 */
public class A074035 extends A074033 {

  @Override
  protected Z dd(final int a, final int n) {
    // Some contortions to avoid rationals included here
    Z t;
    switch (n & 3) {
      case 1:
      case 3:
        t = qp(n / 2).negate();
        break;
      case 2:
        t = qp(n / 2);
        break;
      default: // 4 (or 0)
        t = Z.ZERO;
        break;
    }
    return t.add(qp(n - 1)).divide(mQ.square());
  }
}
