package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037204 Numbers that occur in runs of length 1 in A037203.
 * @author Sean A. Irvine
 */
public class A037204 extends A037203 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (!t.equals(mA) && !mA.equals(mB)) {
        return mA;
      }
    }
  }
}
