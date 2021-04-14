package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046583 First denominator and then numerator of each element to the right of the central elements of the 1/4-Pascal triangle (by row), excluding 4's.
 * @author Sean A. Irvine
 */
public class A046583 extends A046576 {

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
