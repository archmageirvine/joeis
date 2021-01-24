package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038658 Gaps of 9 in sequence A038593 (upper terms).
 * @author Sean A. Irvine
 */
public class A038658 extends A038593 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(9).equals(mA)) {
        return mA;
      }
    }
  }
}
