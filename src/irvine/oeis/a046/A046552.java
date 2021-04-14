package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046552 First numerator and then denominator of each element of the 1/3-Pascal triangle (by row), excluding 3's.
 * @author Sean A. Irvine
 */
public class A046552 extends A046534 {

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
