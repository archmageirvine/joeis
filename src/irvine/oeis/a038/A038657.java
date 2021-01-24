package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038657 Gaps of 9 in sequence A038593 (lower terms).
 * @author Sean A. Irvine
 */
public class A038657 extends A038593 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(9).equals(mA)) {
        return t;
      }
    }
  }
}
