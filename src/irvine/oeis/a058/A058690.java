package irvine.oeis.a058;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058690 McKay-Thompson series of class 47A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058690 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 1;

  private void theta(final int a, final int b, final int c, final int n, final Z[] coeff, final int k) {
    for (int j = 0; j * j <= n; ++j) {
      final int plus = (a * k * k + b * k * j + c * j * j) >>> 1;
      if (plus < coeff.length) {
        coeff[plus] = coeff[plus].add(1);
      }
      if (j != 0) {
        final int minus = (a * k * k - b * k * j + c * j * j) >>> 1;
        if (minus < coeff.length) {
          coeff[minus] = coeff[minus].add(1);
        }
      }
    }
  }

  private Polynomial<Z> theta(final int a, final int b, final int c, final int n) {
    final Z[] coeff = new Z[n + 1];
    Arrays.fill(coeff, Z.ZERO);
    for (int k = 0; k * k <= n; ++k) {
      theta(a, b, c, n, coeff, k);
      if (k != 0) {
        theta(a, b, c, n, coeff, -k);
      }
    }
    return Polynomial.create(coeff);
  }

  @Override
  public Z next() {
    final Polynomial<Z> eta = RING.eta(RING.x(), ++mN);
    final Polynomial<Z> a = RING.subtract(theta(2, 2, 24, mN), theta(4, 2, 12, mN)).shift(1);
    final Polynomial<Z> b = RING.multiply(RING.multiply(eta, eta.substitutePower(47, mN), mN), Z.TWO);
    return RING.coeff(a, b, mN);
  }
}
