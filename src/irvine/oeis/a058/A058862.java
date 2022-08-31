package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a007.A007134;

/**
 * A058862 Number of chordal labeled graphs (connected or not) with n nodes.
 * @author Sean A. Irvine
 */
public class A058862 extends A007134 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  {
    mA.add(Q.ZERO);
  }
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA.add(new Q(super.next(), mF));
    return RING.exp(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}

