package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053053 Append n-th prime to previous term, reverse alternate terms.
 * @author Sean A. Irvine
 */
public class A053053 extends A000040 {

  private boolean mForward = false;
  private final StringBuilder mF = new StringBuilder();
  private final StringBuilder mR = new StringBuilder();

  @Override
  public Z next() {
    mForward = !mForward;
    final Z p = super.next();
    mF.append(p);
    mR.insert(0, p);
    return new Z(mForward ? mF : mR);
  }
}
