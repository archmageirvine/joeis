package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046579 First numerator and then denominator of the elements to the right of the central elements of the 1/4-Pascal triangle (by row), excluding 4's.
 * @author Sean A. Irvine
 */
public class A046579 extends A046575 {

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
