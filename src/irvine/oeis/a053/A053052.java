package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053052 Append n to the previous term, reverse alternate terms.
 * @author Sean A. Irvine
 */
public class A053052 implements Sequence {

  private boolean mForward = false;
  private final StringBuilder mF = new StringBuilder();
  private final StringBuilder mR = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    mForward = !mForward;
    mF.append(++mN);
    mR.insert(0, mN);
    return new Z(mForward ? mF : mR);
  }
}
