package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046567 First denominator and then numerator of the 1/4-Pascal triangle (by row), excluding 1's and 4's.
 * @author Sean A. Irvine
 */
public class A046567 extends A046566 {

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
