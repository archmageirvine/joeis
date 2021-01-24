package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038644 Gaps of 2 in sequence A038593 (upper terms).
 * @author Sean A. Irvine
 */
public class A038644 extends A038593 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(2).equals(mA)) {
        return mA;
      }
    }
  }
}
