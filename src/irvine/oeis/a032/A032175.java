package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a004.A004111;

/**
 * A032175 Number of connected functions of n points with no symmetries.
 * @author Sean A. Irvine
 */
public class A032175 extends A004111 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = 0;
  {
    mA.add(new Q(super.next()));
  }

  @Override
  public Z next() {
    mA.add(new Q(super.next()));
    return A032171.chk(mA, ++mN).coeff(mN).toZ();
  }
}
