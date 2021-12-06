package irvine.oeis.a044;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A044048 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A044048 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, new Q(-6), Q.FIVE));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.SIX, Q.ZERO, Q.ZERO, new Q(-18)));
  private static final Polynomial<Q> C3 = RING.create(Arrays.asList(Q.ONE, new Q(-3), Q.TWO));
  private static final Polynomial<Q> C4 = RING.create(Arrays.asList(Q.THREE, Q.SIX));

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> f = RING.sqrt(C1, mN);
    return RING.subtract(RING.subtract(RING.subtract(C2, RING.multiply(C3, f, mN)),
      RING.multiply(C4, f.substitutePower(2, mN))),
      RING.multiply(f.substitutePower(3, mN), Q.TWO)).coeff(mN).divide(12).toZ();
  }
}

