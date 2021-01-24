package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A038613 Primes not containing the digit '5'.
 * @author Sean A. Irvine
 */
public class A038613 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitCounts(p)[5] == 0) {
        return p;
      }
    }
  }
}
