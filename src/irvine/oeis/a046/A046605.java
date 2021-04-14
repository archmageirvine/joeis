package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046605 First denominator and then numerator of the 1/5-Pascal triangle (by row), excluding 1's and 5's.
 * @author Sean A. Irvine
 */
public class A046605 extends A046604 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Z.FIVE.equals(a)) {
        return a;
      }
    }
  }
}
