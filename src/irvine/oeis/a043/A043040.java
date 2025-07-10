package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A045639 Palindromic and divisible by 4.
 * @author Sean A. Irvine
 */
public class A043040 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(5) == 0) {
        return p;
      }
    }
  }
}
