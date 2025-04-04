package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A076433 Perfect powers for which the two closest perfect powers are greater.
 * @author Sean A. Irvine
 */
public class A076433 extends A001597 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = super.next();
      if (mA.subtract(t).compareTo(mC.subtract(mA)) > 0) {
        return mA;
      }
    }
  }
}

