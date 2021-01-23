package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032756 Palindromic Super-8 Numbers.
 * @author Sean A. Irvine
 */
public class A032756 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(8).multiply(8).toString().contains("88888888")) {
        return p;
      }
    }
  }
}
