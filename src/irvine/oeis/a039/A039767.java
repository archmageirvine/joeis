package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039767 Numbers k such that gcd(phi(k), k-1) = number of prime factors of (k-1).
 * @author Sean A. Irvine
 */
public class A039767 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(Euler.phiAsLong(++mN), mN - 1) == Jaguar.factor(mN - 1).omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
