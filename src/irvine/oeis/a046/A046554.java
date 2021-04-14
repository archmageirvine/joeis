package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046554 First denominator and then numerator of each element to the right of the central elements of the 1/3-Pascal triangle (by row), excluding 3's.
 * @author Sean A. Irvine
 */
public class A046554 extends A046547 {

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
