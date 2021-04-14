package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046594 First denominator and then numerator of each element of the 1/4-Pascal triangle (by row), excluding 2's and 4's.
 * @author Sean A. Irvine
 */
public class A046594 extends A046592 {

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
