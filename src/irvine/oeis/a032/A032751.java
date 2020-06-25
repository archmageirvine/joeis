package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032751 Palindromic <code>Super-3</code> Numbers.
 * @author Sean A. Irvine
 */
public class A032751 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(3).multiply(3).toString().contains("333")) {
        return p;
      }
    }
  }
}
