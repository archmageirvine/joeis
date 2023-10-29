package irvine.oeis.a066;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a096.A096332;

/**
 * A066537 Number of planar graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A066537 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Sequence mA = new A096332();
  private final Polynomial<Q> mB = RING.empty();
  {
    mB.add(Q.ZERO);
  }
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mB.add(new Q(mA.next()));
    return RING.serlaplace(RING.exp(RING.hadamardMultiply(mB, RING.exp(RING.x(), mN)), mN)).coeff(mN).toZ();
  }
}
