package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046616 First numerator and then denominator of the elements to the right of the central elements of the 1/5-Pascal triangle (by row), excluding 1's and 5's.
 * @author Sean A. Irvine
 */
public class A046616 extends A046615 {

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
