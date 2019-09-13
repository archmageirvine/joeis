package irvine.oeis.a025;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025757 4th order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025757 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.monomial(new Q(4), 0);
  private static final Polynomial<Q> C1 = RING.monomial(new Q(3), 0);
  private static final Polynomial<Q> C2 = RING.oneMinusXToTheN(new Q(16), 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(NUM, RING.add(C1, RING.sqrt(RING.sqrt(C2, mN), mN)), mN).toZ();
  }
}
