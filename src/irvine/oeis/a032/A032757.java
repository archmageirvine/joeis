package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032757 Palindromic Super-9 Numbers.
 * @author Sean A. Irvine
 */
public class A032757 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(9).multiply(9).toString().contains("999999999")) {
        return p;
      }
    }
  }
}
