package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002293;

/**
 * A078999 Coefficients A_n for the s=4 tennis ball problem.
 * @author Sean A. Irvine
 */
public class A078999 extends Sequence0 {

  private final DirectSequence mT = new A002293();
  private final DirectSequence mY = DirectSequence.create(new A078995());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mY.a(mN + 1).subtract(mT.a(mN + 1).multiply(5L * mN + 6)).divide2();
  }
}

