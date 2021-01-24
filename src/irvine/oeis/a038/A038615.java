package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A038615 Primes not containing the digit '7'.
 * @author Sean A. Irvine
 */
public class A038615 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitCounts(p)[7] == 0) {
        return p;
      }
    }
  }
}
