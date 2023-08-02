package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002681 Numerators of coefficients for repeated integration.
 * @author Sean A. Irvine
 */
public class A002681 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  protected Q mA = computeM(0);

  protected Q computeM(final int n) {
    Polynomial<Q> f = RING.x();
    for (int k = 1; k <= n; ++k) {
      f = RING.multiply(f, RING.create(Arrays.asList(new Q((long) -k * k), Q.ZERO, Q.ONE)));
    }
    f = RING.integrate(f);
    final Q definite = RING.eval(f, Q.ONE);
    return definite.multiply(new Q(Z.TWO, mF.factorial(2 * n + 1)));
  }
  
  protected Q a(final int n) {
    final Q m = computeM(n);
    final Q r = m.multiply(2L * n).add(mA.multiply(n).divide(2));
    mA = m;
    return r;
  }

  @Override
  public Z next() {
    return a(++mN).num();
  }
}
