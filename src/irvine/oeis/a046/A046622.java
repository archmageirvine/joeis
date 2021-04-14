package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046622 Odd numbers in writing first numerator and then denominator of each element of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046622 extends A046601 {

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
