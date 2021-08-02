package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A049514 Starting index of a string of 2 or more consecutive equal digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A049514 extends A000796 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z s = mA;
      mA = super.next();
      if (s.equals(mA)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

