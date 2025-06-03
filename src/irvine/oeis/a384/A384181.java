package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A384181 Primes p such that k! + p or |k! - p| is composite for all k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A384181 extends A000040 {

  private boolean is(final long p) {
    for (long k = 1; k <= p; ++k) {
      final Z f = Functions.FACTORIAL.z(k);
      if (f.subtract(p).abs().isProbablePrime() && f.add(p).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}
