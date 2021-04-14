package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046620 First denominator and then numerator of each element of the 1/5-Pascal triangle (by row), excluding 5's.
 * @author Sean A. Irvine
 */
public class A046620 extends A046602 {

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
