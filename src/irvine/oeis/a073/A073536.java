package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a058.A058842;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073536 extends A058842 {

  private Z mA = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (!t.multiply(3).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
