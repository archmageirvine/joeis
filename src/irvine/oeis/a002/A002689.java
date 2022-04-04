package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002689 Denominators of coefficients for repeated integration.
 * @author Sean A. Irvine
 */
public class A002689 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  protected Q a(final int n) {
    Polynomial<Q> f = RING.one();
    for (int k = 0; k < n; ++k) {
      f = RING.multiply(f, RING.create(Arrays.asList(new Q(-k), Q.ONE)));
    }
    f = RING.integrate(f);
    final Q definite = RING.eval(f, Q.ONE);
    return definite.divide(mF.factorial(n - 1));
  }
  
  @Override
  public Z next() {
    return a(++mN).den();
  }
}
