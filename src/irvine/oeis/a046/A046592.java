package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046592 First denominator and then numerator of each element of the 1/4-Pascal triangle (by row), excluding 2's.
 * @author Sean A. Irvine
 */
public class A046592 extends A046564 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Z.TWO.equals(a)) {
        return a;
      }
    }
  }
}
