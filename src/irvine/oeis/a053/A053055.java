package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A053055 Append n-th Fibonacci number to previous term, reverse alternate terms.
 * @author Sean A. Irvine
 */
public class A053055 extends A000045 {

  // Note change by Harvey P. Dale changed original method of concatenation, cf. A053054, etc.
  // Due to low importance, I retained Dale's change here.

  {
    setOffset(1);
    super.next();
  }
  private boolean mForward = false;
  private final StringBuilder mF = new StringBuilder();

  @Override
  public Z next() {
    mForward = !mForward;
    final Z p = super.next();
    mF.append(p);
    return new Z(mForward ? mF : new StringBuilder(mF).reverse());
  }
}
