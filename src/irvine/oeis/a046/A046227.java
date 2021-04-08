package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046227 First numerator and then denominator of elements to right of central elements of 1/2-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046227 extends A046225 {

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
