package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046561 Distinct odd numbers in writing first numerator and then denominator of each element to the right of the central elements of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046561 extends A046560 {

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
