package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067237 Numbers k such that gcd(sigma(k),k) = k/5.
 * @author Sean A. Irvine
 */
public class A067237 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long k = 5 * ++mN;
      if (Jaguar.factor(k).sigma().gcd(k).longValueExact() == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
