package irvine.oeis.a073;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073929.
 * @author Sean A. Irvine
 */
public class A073943 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long k = 0;
    while (true) {
      if (LongUtils.modPow(++k, k, p) == p - 1) {
        return Z.valueOf(k);
      }
    }
  }
}

