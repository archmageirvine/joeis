package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046615 First numerator and then denominator of the elements to the right of the central elements of the 1/5-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046615 extends A046613 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Z.ONE.equals(a)) {
        return a;
      }
    }
  }
}
