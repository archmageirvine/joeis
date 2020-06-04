package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000795;

/**
 * A005647 Sali\u00e9 numbers.
 * @author Sean A. Irvine
 */
public class A005647 extends A000795 {

  private int mRightShift = -1;

  @Override
  public Z next() {
    return super.next().shiftRight(++mRightShift);
  }
}

