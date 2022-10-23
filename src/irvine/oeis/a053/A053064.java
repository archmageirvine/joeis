package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053064 Alternately append n to end or beginning of previous term.
 * @author Sean A. Irvine
 */
public class A053064 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mA = new StringBuilder();
  private boolean mFront = false;

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
