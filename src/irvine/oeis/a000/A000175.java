package irvine.oeis.a000;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000175 Related to zeros of Bessel function.
 * @author Sean A. Irvine
 */
public class A000175 extends Sequence1 {

  // Using method described by Herman Jamke

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  private Z pi0(final int n) {
    Z p = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      p = p.multiply(Z.valueOf(k).pow(n / k));
    }
    return p;
  }

  private Polynomial<Q> j(final int v, final int m) {
    final Q[] coeffs = new Q[2 * m + v + 1];
    Arrays.fill(coeffs, Q.ZERO);
    for (int k = 0; k <= m; ++k) {
      final int power = 2 * k + v;
      final Z den = mF.factorial(k).multiply(mF.factorial(k + v)).shiftLeft(power);
      coeffs[2 * k + v] = new Q(Z.NEG_ONE.pow(k), den);
    }
    return RING.create(Arrays.asList(coeffs));
  }

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Q> jRatio = RING.series(j(1, mN), RING.multiply(j(0, mN), Q.TWO), mN);
    return jRatio.coeff(mN).multiply(pi0((mN + 1) / 2)).multiply(Z.ONE.shiftLeft(mN + 1)).toZ();
  }
}
