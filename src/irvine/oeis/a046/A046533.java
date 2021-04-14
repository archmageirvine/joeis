package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046533 First denominator and then numerator of 1/2-Pascal triangle (by row), excluding 2's.
 * @author Sean A. Irvine
 */
public class A046533 extends A046214 {

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
