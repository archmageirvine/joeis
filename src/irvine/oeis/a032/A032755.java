package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032755 Palindromic Super-7 Numbers.
 * @author Sean A. Irvine
 */
public class A032755 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(7).multiply(7).toString().contains("7777777")) {
        return p;
      }
    }
  }
}
