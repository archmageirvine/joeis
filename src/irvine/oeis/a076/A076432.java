package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A076432 Perfect powers for which the three closest perfect powers are smaller.
 * @author Sean A. Irvine
 */
public class A076432 extends A001597 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = mD;
      mD = super.next();
      if (mC.subtract(t).compareTo(mD.subtract(mC)) < 0) {
        return mC;
      }
    }
  }
}

