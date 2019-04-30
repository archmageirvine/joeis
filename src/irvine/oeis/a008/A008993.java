package irvine.oeis.a008;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008993 Numerators of coefficients in expansion of cube root of <code>sin(x)</code>.
 * @author Sean A. Irvine
 */
public class A008993 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.pow(RING.sin(RING.x(), mN + 1).shift(-1), Q.ONE_THIRD, mN).coeff(mN));
  }
}

