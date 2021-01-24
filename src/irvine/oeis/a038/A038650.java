package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038650 Gaps of 5 in sequence A038593 (upper terms).
 * @author Sean A. Irvine
 */
public class A038650 extends A038593 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(5).equals(mA)) {
        return mA;
      }
    }
  }
}
