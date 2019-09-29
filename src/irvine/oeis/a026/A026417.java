package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026417.
 * @author Sean A. Irvine
 */
public class A026417 extends A026416 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return t;
      } else {
        // Evilness to handle the 2 we don't want here
        remove(Z.TWO);
        mForbidden.remove(Z.TWO);
      }
    }
  }
}
