package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068948.
 * @author Sean A. Irvine
 */
public class A068948 extends A068947 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

