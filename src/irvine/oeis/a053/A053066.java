package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053066 Alternately append n-th prime to end or beginning of previous term.
 * @author Sean A. Irvine
 */
public class A053066 extends A000040 {

  private final StringBuilder mA = new StringBuilder();
  private boolean mFront = false;

  @Override
  public Z next() {
    mFront = !mFront;
    if (mFront) {
      mA.insert(0, super.next());
    } else {
      mA.append(super.next());
    }
    return new Z(mA);
  }
}
