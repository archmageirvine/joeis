package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046604 First denominator and then numerator of the 1/5-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046604 extends A046602 {

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
