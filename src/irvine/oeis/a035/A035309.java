package irvine.oeis.a035;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035309 Triangle read by rows giving number of ways to glue sides of a 2n-gon so as to produce a surface of genus g.
 * @author Sean A. Irvine
 */
public class A035309 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> HALF_X = RING.divide(RING.x(), Q.TWO);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int g) {
    final int g2 = 2 * g;
    final Polynomial<Q> c = RING.pow(RING.series(HALF_X, RING.tanh(HALF_X, n + 1), n + 1), n + 1, n + 1);
    return c.coeff(g2).multiply(mF.factorial(2 * n)).divide(mF.factorial(n + 1)).divide(mF.factorial(n - g2)).toZ();
  }

  @Override
  public Z next() {
    if (++mM >= (mN + 2) / 2) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

