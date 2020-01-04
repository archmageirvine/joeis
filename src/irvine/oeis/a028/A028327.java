package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028327.
 * @author Sean A. Irvine
 */
public class A028327 extends A028326 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return t;
      }
    }
  }
}
