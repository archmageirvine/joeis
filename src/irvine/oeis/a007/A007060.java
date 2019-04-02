package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000806;

/**
 * A007060 Number of ways n couples can sit in a row without any spouses next to each other.
 * @author Sean A. Irvine
 */
public class A007060 extends A000806 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().abs().multiply(mF).shiftLeft(mN);
  }
}
