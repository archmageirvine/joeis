package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a050.A050498;

/**
 * A039670 Sets of 4 numbers in arithmetic progression with common difference 6 and whose phi values are equal.
 * @author Sean A. Irvine
 */
public class A039670 extends A050498 {

  private Z mA = null;
  private long mAdd = 3;

  @Override
  public Z next() {
    if (++mAdd > 3) {
      mA = super.next();
      mAdd = 0;
    }
    return mA.add(mAdd * 6);
  }
}
