package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033664 Every suffix is prime.
 * @author Sean A. Irvine
 */
public class A033664 extends A000040 {

  private boolean isA033664(final String s) {
    for (int k = 1; k < s.length(); ++k) {
      if (!new Z(s.substring(k)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isA033664(p.toString())) {
        return p;
      }
    }
  }
}
