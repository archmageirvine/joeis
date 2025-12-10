package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036044;

/**
 * A391095 Integers k such that Sum_{j|k, j!=k} A036044(j) = A036044(k).
 * @author Sean A. Irvine
 */
public class A391095 extends Sequence1 {

  private final A036044 mBcr = new A036044();
  private long mN = 0;

  private boolean is(final long n) {
    Z s = mBcr.a(Z.valueOf(n));
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!d.equals(n)) {
        s = s.subtract(mBcr.a(d));
        if (s.signum() < 0) {
          return false;
        }
      }
    }
    return s.isZero();
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
