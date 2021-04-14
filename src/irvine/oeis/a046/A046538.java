package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046538 First denominator and then numerator of the 1/3-Pascal triangle (by row), excluding 1's and 3's.
 * @author Sean A. Irvine
 */
public class A046538 extends A046537 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Z.THREE.equals(a)) {
        return a;
      }
    }
  }
}
