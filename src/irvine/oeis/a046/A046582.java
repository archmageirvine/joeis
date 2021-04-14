package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046582 First denominator and then numerator of each element of the 1/4-Pascal triangle (by row), excluding 4's.
 * @author Sean A. Irvine
 */
public class A046582 extends A046564 {

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
