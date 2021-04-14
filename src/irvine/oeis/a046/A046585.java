package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046585 Odd numbers in writing first denominator and then numerator of each element of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046585 extends A046564 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!a.isEven()) {
        return a;
      }
    }
  }
}
