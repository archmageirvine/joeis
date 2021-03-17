package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A045642 Palindromic and divisible by 7.
 * @author Sean A. Irvine
 */
public class A045642 extends A002113 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(7) == 0) {
        return p;
      }
    }
  }
}
