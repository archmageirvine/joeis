package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a056.A056525;

/**
 * A045571 Numbers that are palindromic, divisible by 11 and have an odd number of digits.
 * @author Sean A. Irvine
 */
public class A045571 extends A056525 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(11) == 0) {
        return n;
      }
    }
  }
}
