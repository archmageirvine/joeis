package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046621 First denominator and then numerator of each element to the right of the central elements of the 1/5-Pascal triangle (by row), excluding 5's.
 * @author Sean A. Irvine
 */
public class A046621 extends A046614 {

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
