package irvine.oeis.a045;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A045906 Numbers of nonisomorphic systems of catafusenes (see Cyvin et al. (1994) for precise definition).
 * @author Sean A. Irvine
 */
public class A045906 extends AbstractSequence {

  /* Construct the sequence. */
  public A045906() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.multiply(RING.create(Arrays.asList(Q.ONE, Q.ZERO, Q.ONE, new Q(-6), Q.NEG_ONE)), Q.EIGHT);
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.ONE, new Q(-3)));
  private static final Polynomial<Q> C3 = RING.create(Arrays.asList(Q.ONE, new Q(-5)));
  private static final Polynomial<Q> C4 = RING.create(Arrays.asList(Q.FIVE, Q.THREE, new Q(-5), new Q(-7)));
  private static final Polynomial<Q> C5 = RING.create(Arrays.asList(Q.ONE, Q.ZERO, new Q(-5)));
  private static final Polynomial<Q> C6 = RING.create(Arrays.asList(Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, new Q(-5)));
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private static final Polynomial<Q> X2 = RING.oneMinusXToTheN(2);
  private static final Polynomial<Q> X4 = RING.oneMinusXToTheN(4);
  private static final Polynomial<Q> X1_5 = RING.pow(X1, 5);
  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> f1 = RING.multiply(RING.multiply(RING.sqrt(X1_5, mN), C2, mN), RING.sqrt(C3, mN), mN);
    final Polynomial<Q> f2 = RING.series(RING.multiply(RING.multiply(C4, RING.sqrt(X2, mN), mN), RING.sqrt(C5, mN), mN), X1, mN);
    final Polynomial<Q> f3 = RING.multiply(RING.multiply(RING.sqrt(X4, mN), Q.TWO), RING.sqrt(C6, mN), mN);
    final Polynomial<Q> gf = RING.subtract(RING.subtract(RING.subtract(C1, f1), f2), f3);
    return gf.coeff(mN).toZ().divide(16);
  }
}
