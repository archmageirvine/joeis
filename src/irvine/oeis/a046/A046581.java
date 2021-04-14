package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046581 First numerator and then denominator of each element of the 1/4-Pascal triangle (by row), excluding 4's.
 * @author Sean A. Irvine
 */
public class A046581 extends A046563 {

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
