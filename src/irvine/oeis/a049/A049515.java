package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A049515 Starting index of a string of 3 or more consecutive equal digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A049515 extends A000796 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z s = mA;
      mA = mB;
      mB = super.next();
      if (s.equals(mA) && s.equals(mB)) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}

