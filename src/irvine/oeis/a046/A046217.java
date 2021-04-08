package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046217 First numerator and then denominator of 1/2-Pascal triangle (by row) excluding 1's and 2's.
 * @author Sean A. Irvine
 */
public class A046217 extends A046213 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Z.TWO.compareTo(t) < 0) {
        return t;
      }
    }
  }
}
