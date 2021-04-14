package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046617 First numerator and then denominator of the elements to the right of the central elements of the 1/5-Pascal triangle (by row), excluding 5's.
 * @author Sean A. Irvine
 */
public class A046617 extends A046613 {

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
