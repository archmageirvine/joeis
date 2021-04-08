package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046215 First numerator and then denominator of 1/2-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046215 extends A046213 {

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
