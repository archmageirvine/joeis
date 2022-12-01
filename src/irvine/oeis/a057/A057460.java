package irvine.oeis.a057;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002475;

/**
 * A057460 Numbers k such that x^k + x^2 + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A057460 extends A002475 {

  @Override
  protected Polynomial<Z> makePoly(final int n) {
    if (n == 0 || n == 2) {
      return Polynomial.create(0);
    }
    if (n == 1) {
      return Polynomial.create(1);
    }
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    coeff[2] = 1;
    coeff[n] = 1;
    return Polynomial.create(coeff);
  }
}
