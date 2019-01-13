package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A008347.
 * @author Sean A. Irvine
 */
public class A008347 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : super.next().subtract(mA);
    return mA;
  }
}


