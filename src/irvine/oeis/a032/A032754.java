package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032754 Palindromic Super-6 Numbers.
 * @author Sean A. Irvine
 */
public class A032754 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(6).multiply(6).toString().contains("666666")) {
        return p;
      }
    }
  }
}
