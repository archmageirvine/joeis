package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046537 First denominator and then numerator of the 1/3-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046537 extends A046535 {

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
