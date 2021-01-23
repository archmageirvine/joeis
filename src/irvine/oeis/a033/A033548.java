package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A033548 Honaker primes: primes P(k) such that sum of digits of P(k) equals sum of digits of k.
 * @author Sean A. Irvine
 */
public class A033548 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitSum(p) == ZUtils.digitSum(++mN)) {
        return p;
      }
    }
  }
}
