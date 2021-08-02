package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A049517 Starting index of a string of 5 or more consecutive equal digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A049517 extends A000796 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z s = mA;
      mA = mB;
      mB = mC;
      mC = mD;
      mD = super.next();
      if (s.equals(mA) && s.equals(mB) && s.equals(mC) && s.equals(mD)) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}

