package irvine.oeis.a057;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002475;

/**
 * A057489 Numbers n &gt; 13 such that x^n + x^13 + x^12 + x^11 + x^10 + x^9 + x^8 + x^7 + x^6 + x^5 + x^4 + x^3 + x^2 + x + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A057489 extends A002475 {

  @Override
  protected Polynomial<Z> makePoly(final int n) {
    if (n < 14) {
      return Polynomial.create(0);
    }
    final long[] coeff = new long[n + 1];
    Arrays.fill(coeff, 0, 14, 1L);
    coeff[n] = 1;
    return Polynomial.create(coeff);
  }
}
