package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A005479 Prime Lucas numbers (cf. A000032).
 * @author Sean A. Irvine
 */
public class A005479 extends A000032 {

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.isProbablePrime()) {
        return f;
      }
    }
  }
}
