package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046216 First denominator and then numerator of 1/2-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046216 extends A046214 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ONE.equals(t)) {
        return t;
      }
    }
  }
}
