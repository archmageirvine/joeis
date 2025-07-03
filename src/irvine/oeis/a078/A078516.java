package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002293;

/**
 * A078516 Sum of balls on the lawn for the s=4 tennis ball problem.
 * @author Sean A. Irvine
 */
public class A078516 extends Sequence0 {

  private final DirectSequence mT = new A002293();
  private final DirectSequence mY = DirectSequence.create(new A078995());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mT.a(mN + 1).multiply(4L * mN * mN + 11L * mN + 8).subtract(mY.a(mN + 1)).divide2();
  }
}

