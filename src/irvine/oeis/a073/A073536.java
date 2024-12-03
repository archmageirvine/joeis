package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a058.A058842;

/**
 * A073536 Breaking indices for A058842 (i.e., n such that A058842(n) is not equal to 3*A058842 (n-1) ).
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
