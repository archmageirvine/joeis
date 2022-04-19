package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A158217 Primes whose digit sum is a single-digit prime.
 * @author Georg Fischer
 */
public class A158217 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long dsum = ZUtils.digitSum(p);
      if (dsum <= 7 && (dsum == 2 || dsum == 3 || dsum == 5 || dsum == 7)) {
        return p;
      }
    }
  }
}
