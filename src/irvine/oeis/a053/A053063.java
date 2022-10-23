package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053063 Pendulum numbers: alternately append n to beginning or end of previous term.
 * @author Sean A. Irvine
 */
public class A053063 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mA = new StringBuilder();
  private boolean mFront = true;

  @Override
  public Z next() {
    ++mN;
    mFront = !mFront;
    if (mFront) {
      mA.insert(0, mN);
    } else {
      mA.append(mN);
    }
    return new Z(mA);
  }
}
