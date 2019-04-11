package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014693 In sequence of prime numbers add 1 to first number, 2 to 3rd number, 3 to 5th number, <code>...</code> then subtract 1 from 2nd number, 2 from 4th number, 3 from 6th number and so on.
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
