package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046532 First numerator and then denominator of 1/2-Pascal triangle (by row), excluding 2's.
 * @author Sean A. Irvine
 */
public class A046532 extends A046213 {

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
