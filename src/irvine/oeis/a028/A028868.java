package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A028868 Primes that when squared give numbers with digits in nonascending order.
 * @author Sean A. Irvine
 */
public class A028868 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.isNonincreasingDigits(p.square())) {
        return p;
      }
    }
  }
}
