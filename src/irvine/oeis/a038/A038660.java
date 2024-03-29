package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038660 Gaps of 10 in sequence A038593 (upper terms).
 * @author Sean A. Irvine
 */
public class A038660 extends A038593 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(10).equals(mA)) {
        return mA;
      }
    }
  }
}
