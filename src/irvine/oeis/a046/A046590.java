package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046590 Numerators of the elements to the right of the central elements of the 1/4-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046590 extends A046580 {

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
