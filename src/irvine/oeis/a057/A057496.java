package irvine.oeis.a057;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002475;

/**
 * A057496 Numbers n such that x^n + x^3 + x^2 + x + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A057496 extends A002475 {

  @Override
  protected Polynomial<Z> makePoly(final int n) {
    if (n < 6) {
      return n < 1 ? Polynomial.create(0) : Polynomial.create(1);
    }
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    coeff[1] = 1;
    coeff[2] = 1;
    coeff[3] = 1;
    coeff[n] = 1;
    return Polynomial.create(coeff);
  }
}
