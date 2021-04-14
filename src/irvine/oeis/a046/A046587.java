package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046587 Even numbers in writing first numerator and then denominator of each element of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046587 extends A046563 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.isEven()) {
        return a;
      }
    }
  }
}
