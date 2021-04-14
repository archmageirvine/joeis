package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046597 Denominators of the 1/4-Pascal triangle (by row), excluding 4's.
 * @author Sean A. Irvine
 */
public class A046597 extends A046569 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Z.FOUR.equals(a)) {
        return a;
      }
    }
  }
}
