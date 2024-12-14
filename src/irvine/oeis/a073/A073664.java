package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073580.
 * @author Sean A. Irvine
 */
public class A073664 extends A073661 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = super.next();
      if (t.equals(mN)) {
        return t;
      }
    }
  }
}
