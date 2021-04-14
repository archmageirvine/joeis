package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046600 First numerator and then denominator of each element of the 1/4-Pascal triangle (by row), excluding 1's and 4's.
 * @author Sean A. Irvine
 */
public class A046600 extends A046565 {

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
