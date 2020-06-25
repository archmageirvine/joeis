package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032752 Palindromic <code>Super-4</code> Numbers.
 * @author Sean A. Irvine
 */
public class A032752 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(4).multiply(4).toString().contains("4444")) {
        return p;
      }
    }
  }
}
