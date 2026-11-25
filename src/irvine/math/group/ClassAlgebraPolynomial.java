package irvine.math.group;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Polynomial interpolation for operators of a finite group class algebra.
 * @author Gregory Morse
 */
final class ClassAlgebraPolynomial {

  private ClassAlgebraPolynomial() { }

  static Q[] interpolate(final Z[] x, final Z[] y) {
    final Q[] polynomial = new Q[x.length];
    Arrays.fill(polynomial, Q.ZERO);
    for (int i = 0; i < x.length; ++i) {
      final Z[] term = new Z[x.length];
      Arrays.fill(term, Z.ZERO);
      term[0] = y[i];
      Z denominator = Z.ONE;
      int degree = 0;
      for (int j = 0; j < x.length; ++j) {
        if (j != i) {
          for (int k = ++degree; k >= 1; --k) {
            term[k] = term[k - 1].subtract(x[j].multiply(term[k]));
          }
          term[0] = x[j].negate().multiply(term[0]);
          denominator = denominator.multiply(x[i].subtract(x[j]));
        }
      }
      for (int j = 0; j < polynomial.length; ++j) {
        polynomial[j] = polynomial[j].add(new Q(term[j], denominator));
      }
    }
    return polynomial;
  }
}
