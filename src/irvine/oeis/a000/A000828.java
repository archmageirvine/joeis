package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A000828.
 * @author Sean A. Irvine
 */
public class A000828 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.create(Arrays.asList(Q.ZERO, Q.TWO));
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> sin = RING.sin(RING.x(), mN);
    final Polynomial<Q> cos = RING.cos(RING.x(), mN);
    final Polynomial<Q> cos2 = RING.cos(TWO, mN);
    final Polynomial<Q> egf = RING.series(RING.multiply(cos, RING.add(cos, sin), mN), cos2, mN);
    return egf.coeff(mN).multiply(mF.factorial(mN)).toZ();
  }
}
