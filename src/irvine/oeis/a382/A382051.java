package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A382051 Primes prime(k) such that k*log(k)/prime(k) &lt; (k-1)*log(k-1)/prime(k-1).
 * @author Sean A. Irvine
 */
public class A382051 extends A000040 {

  private CR mA = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (++mN > 1) {
        final CR t = CR.valueOf(mN).log().multiply(mN).divide(p);
        if (t.compareTo(mA) < 0) {
          mA = t;
          return p;
        }
        mA = t;
      }
    }
  }
}
