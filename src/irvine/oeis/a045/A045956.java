package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045956 Twin even-lucky-numbers: upper terms.
 * @author Sean A. Irvine
 */
public class A045956 extends A045954 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.TWO.equals(mA.subtract(t))) {
        return mA;
      }
    }
  }
}
