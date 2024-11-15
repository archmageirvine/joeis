package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A073064 Primes with non-distinct digits.
 * @author Sean A. Irvine
 */
public class A073064 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      for (final int v : ZUtils.digitCounts(p)) {
        if (v > 1) {
          return p;
        }
      }
    }
  }
}
