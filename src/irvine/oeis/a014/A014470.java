package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014470.
 * @author Sean A. Irvine
 */
public class A014470 extends A014469 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ONE.equals(t)) {
        return t;
      }
    }
  }
}
