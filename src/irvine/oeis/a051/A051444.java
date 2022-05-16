package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051444 Smallest k such that sigma(k) = n, or 0 if there is no such k, where sigma = A000203 = sum of divisors.
 * @author Sean A. Irvine
 */
public class A051444 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    for (long k = 1; k < mN; ++k) {
      if (Jaguar.factor(k).sigma().longValueExact() == mN) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}

