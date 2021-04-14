package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046593 First denominator and then numerator of each element of the 1/4-Pascal triangle (by row),excluding 1's and 2's.
 * @author Sean A. Irvine
 */
public class A046593 extends A046592 {

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
