package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046553 First denominator and then numerator of each element of the 1/3-Pascal triangle (by row), excluding 3's.
 * @author Sean A. Irvine
 */
public class A046553 extends A046535 {

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
