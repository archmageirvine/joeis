package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046229 First numerator and then denominator of elements to right of central elements of 1/2-Pascal triangle (by row), excluding 2's.
 * @author Sean A. Irvine
 */
public class A046229 extends A046225 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return t;
      }
    }
  }
}
