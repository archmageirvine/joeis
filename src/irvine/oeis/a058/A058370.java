package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A058370 Primes p such that p and p^2 have same digit sum.
 * @author Sean A. Irvine
 */
public class A058370 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitSum(p) == ZUtils.digitSum(p.square())) {
        return p;
      }
    }
  }
}
