package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a007.A007949;

/**
 * A014578.
 * @author Sean A. Irvine
 */
public class A014578 extends A007949 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return Z.ONE.subtract(super.next().mod(2));
  }
}
