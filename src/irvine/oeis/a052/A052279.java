package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052279 Primes such that the sum of the factorials of the digits is a perfect square.
 * @author Sean A. Irvine
 */
public class A052279 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z m = p;
      long sum = 0;
      while (!m.isZero()) {
        final Z[] qr = m.divideAndRemainder(Z.TEN);
        sum += Functions.FACTORIAL.l(qr[1]);
        m = qr[0];
      }
      final long s = LongUtils.sqrt(sum);
      if (s * s == sum) {
        return p;
      }
    }
  }
}
