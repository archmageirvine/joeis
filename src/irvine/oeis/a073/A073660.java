package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073660 Terms of A073659 which retain their relative positions.
 * @author Sean A. Irvine
 */
public class A073660 extends A073659 {

  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = super.next();
      if (mN == 0 || t.equals(mN)) {
        return t;
      }
    }
  }
}
