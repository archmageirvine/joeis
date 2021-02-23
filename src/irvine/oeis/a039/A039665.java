package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a006.A006601;

/**
 * A039665 Sets of 4 consecutive numbers with equal number of divisors.
 * @author Sean A. Irvine
 */
public class A039665 extends A006601 {

  private Z mA = null;
  private long mAdd = 3;

  @Override
  public Z next() {
    if (++mAdd > 3) {
      mA = super.next();
      mAdd = 0;
    }
    return mA.add(mAdd);
  }
}
