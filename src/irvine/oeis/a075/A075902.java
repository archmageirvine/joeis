package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075773.
 * @author Sean A. Irvine
 */
public class A075902 extends A000040 {

  private long mN = 0;
  private long mM = 10;

  private boolean is(Z p) {
    while (p.compareTo(mN) >= 0) {
      if (p.mod(mM) == mN) {
        return true;
      }
      p = p.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mM) {
        mM *= 10;
      }
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
