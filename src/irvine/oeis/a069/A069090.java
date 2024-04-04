package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069090.
 * @author Sean A. Irvine
 */
public class A069090 extends A000040 {

  private boolean is(final Z p) {
    Z q = p.divide(10);
    while (!q.isZero()) {
      if (q.isProbablePrime()) {
        return false;
      }
      q = q.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}

