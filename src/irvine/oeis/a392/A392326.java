package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392326 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A392326 extends A392975 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.compareTo(t) < 0) {
        return mA;
      }
    }
  }
}
