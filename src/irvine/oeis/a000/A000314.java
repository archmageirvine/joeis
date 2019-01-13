package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.util.Collections;

/**
 * A000314.
 * @author Sean A. Irvine
 */
public class A000314 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.create(Collections.singletonList(Q.TWO));

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();
  private Polynomial<Q> mPrev = null;

 private Polynomial<Q> exp(final Polynomial<Q> p, final int n) {
    final Polynomial<Q> twop = RING.multiply(p, Q.TWO);
    final Polynomial<Q> num = RING.subtract(twop, RING.pow(p, 2, mN));
    final Polynomial<Q> den = RING.subtract(TWO, twop);
    final Polynomial<Q> q = RING.series(num, den, n);
    return RING.exp(q, n);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mPrev == null) {
      mPrev = RING.x();
    } else {
      mPrev = RING.shift(exp(mPrev, mN - 1), 1);
    }
    //System.out.println(mPrev);
    return mPrev.coeff(mN).multiply(mF.factorial(mN - 1)).toZ();
  }
}
