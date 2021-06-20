package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A048517 Primes whose sum of digits is the perfect number 28.
 * @author Sean A. Irvine
 */
public class A048517 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitSum(p) == 28) {
        return p;
      }
    }
  }
}
