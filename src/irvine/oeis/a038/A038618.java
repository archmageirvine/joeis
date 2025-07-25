package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A038618 Primes not containing the digit '0'.
 * @author Sean A. Irvine
 */
public class A038618 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitCounts(p)[0] == 0) {
        return p;
      }
    }
  }
}
