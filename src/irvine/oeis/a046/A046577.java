package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046577 First denominator and then numerator of the elements to the right of the central elements of the 1/4-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046577 extends A046576 {

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
