package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058955 Let S(t) = 1 + s_1*t + s_2*t^2 + ... satisfy S' = -S/(2 + S); sequence gives numerators of s_n.
 * @author Sean A. Irvine
 */
public class A058955 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private final Polynomial<Q> mB = RING.empty();
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Q.ONE);
      mB.add(Q.THREE);
      return select(Q.ONE);
    }
    final Q t = RING.coeff(RING.negate(mA), mB, mN - 1).divide(mN);
    mA.add(t);
    mB.add(t);
    return select(t);
  }
}
