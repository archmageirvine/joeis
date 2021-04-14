package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046623 Odd numbers in writing first denominator and then numerator of each element of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046623 extends A046602 {

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
