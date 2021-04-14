package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046221 Odd numbers on numerators of 1/2-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046221 extends A046218 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
