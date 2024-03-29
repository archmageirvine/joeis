package irvine.oeis.a057;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002475;

/**
 * A057461 Numbers k such that x^k + x^3 + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A057461 extends A002475 {

  @Override
  protected Polynomial<Z> makePoly(final int n) {
    if (n == 0 || n == 3) {
      return Polynomial.create(0);
    }
    if (n <= 2) {
      return Polynomial.create(1);
    }
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    coeff[3] = 1;
    coeff[n] = 1;
    return Polynomial.create(coeff);
  }
}
