package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014693.
 * @author Sean A. Irvine
 */
public class A014693 extends A000040 {

  private long mSign = 0;

  @Override
  public Z next() {
    if (mSign <= 0) {
      mSign = 1 - mSign;
    } else {
      mSign = -mSign;
    }
    return super.next().add(mSign);
  }
}
