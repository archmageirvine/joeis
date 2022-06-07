package irvine.oeis.a057;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002475;

/**
 * A057478 Numbers n such that x^n + x^8 + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A057478 extends A002475 {

  @Override
  protected Polynomial<Z> makePoly(final int n) {
    if (n < 9) {
      return Polynomial.create(0);
    }
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    coeff[8] = 1;
    coeff[n] = 1;
    return Polynomial.create(coeff);
  }
}
