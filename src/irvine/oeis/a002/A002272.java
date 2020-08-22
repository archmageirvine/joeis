package irvine.oeis.a002;

import java.util.Collections;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004011;

/**
 * A002272 Theta series of 32-dimensional Quebbemann lattice Q_32.
 * @author Sean A. Irvine
 */
public class A002272 extends A002288 {

  private final Sequence mL1Seq = new A004011();
  private final Polynomial<Z> mDelta = RING.create(Collections.emptyList());
  private final Polynomial<Z> mL1 = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mDelta.add(super.next());
    mL1.add(mL1Seq.next());
    return RING.pow(mL1, 8, mN).coeff(mN)
      .subtract(RING.multiply(RING.pow(mL1, 4, mN), mDelta, mN).coeff(mN).multiply(192))
      .add(RING.multiply(mDelta, mDelta, mN).coeff(mN).multiply(576));
  }
}
