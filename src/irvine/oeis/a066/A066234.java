package irvine.oeis.a066;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000122;
import irvine.oeis.a002.A002408;

/**
 * A066183.
 * @author Sean A. Irvine
 */
public class A066234 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mTheta3Seq = new A000122();
  private final Sequence mDel8Seq = new A002408();
  private final Polynomial<Z> mTheta3 = RING.empty();
  private final Polynomial<Z> mDel8 = RING.empty();
  private int mN = -1;

  // theta_3^39 - 78*theta_3^31*Del8 + 1248*theta_3^23*Del8^2 - 1976*theta_3^15*Del8^3

  @Override
  public Z next() {
    ++mN;
    mTheta3.add(mTheta3Seq.next());
    mDel8.add(mDel8Seq.next());
    return RING.pow(mTheta3, 39, mN).coeff(mN)
      .subtract(RING.multiply(RING.pow(mTheta3, 31, mN), mDel8, mN).coeff(mN).multiply(78))
      .add(RING.multiply(RING.pow(mTheta3, 23, mN), RING.pow(mDel8, 2, mN), mN).coeff(mN).multiply(1248))
      .subtract(RING.multiply(RING.pow(mTheta3, 15, mN), RING.pow(mDel8, 3, mN), mN).coeff(mN).multiply(1976));
  }
}
