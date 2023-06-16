package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A048722 Reversed binary packing of Fibonacci sequence A000045.
 * @author Sean A. Irvine
 */
public class A048722 extends A000045 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      mA = mA.shiftLeft(super.next().longValueExact()).add(1);
    }
    return mA;
  }
}
