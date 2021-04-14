package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046556 Odd numbers found when writing first denominator and then numerator of each element of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046556 extends A046535 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.isOdd()) {
        return a;
      }
    }
  }
}
