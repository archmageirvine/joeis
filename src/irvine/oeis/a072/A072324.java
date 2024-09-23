package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a071.A071383;

/**
 * A072324 Terms of A071383 such that A071383(n) = 5 * A071383(n-1).
 * @author Sean A. Irvine
 */
public class A072324 extends A071383 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.multiply(5).equals(mA)) {
        return mA;
      }
    }
  }
}
