package irvine.oeis.a008;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A008295 Triangle of numbers of point labeled rooted trees.
 * @author Sean A. Irvine
 */
public class A008295 extends A000081 {

  protected static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING_X = new PolynomialRingField<>(RING_Y);
  private static final Polynomial<Polynomial<Q>> Y1 = RING_X.monomial(RING_Y.create(Arrays.asList(Q.ONE, Q.ONE)), 0);
  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected Polynomial<Polynomial<Q>> mR = nextR(0);
  protected Polynomial<Polynomial<Q>> mRR = RING_X.zero();
  protected int mN = -1;
  protected int mM = 0;

  private Polynomial<Polynomial<Q>> nextR(final int n) {
    return RING_X.monomial(RING_Y.create(Collections.singletonList(new Q(super.next()))), n);
  }

  protected void updateR() {
    mR = RING_X.add(mR, nextR(mN));
    mRR = RING_X.multiply(RING_X.multiply(RING_X.multiply(Y1, mR), RING_X.exp(mRR, mN), mN), RING_X.series(RING_X.one(), RING_X.exp(mR, mN), mN));
    mM = 0;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      updateR();
      //System.out.println("r(x)=" + mR);
      //System.out.println("r(x,y)=" + mRR);
    }
    return mRR.coeff(mN).coeff(mM).multiply(mF.factorial(mM)).toZ();
  }

}
