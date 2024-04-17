package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064502 Smallest m such that sum of distinct primes dividing m equals n, or 0 if no such number exists (as at n=1,4,6).
 * @author Sean A. Irvine
 */
public class A064502 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 4 || mN == 6) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      if (Functions.SOPF.z(++k).longValueExact() == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
