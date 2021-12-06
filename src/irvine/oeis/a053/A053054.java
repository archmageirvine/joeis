package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A053054 Append n-th palindromic prime to previous term, reverse alternate terms.
 * @author Sean A. Irvine
 */
public class A053054 extends A002385 {

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
