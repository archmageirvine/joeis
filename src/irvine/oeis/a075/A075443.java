package irvine.oeis.a075;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075443 a(n)=(1/2)Sum_h |h-h'| with h and h' in [1,n], gcd(h,n)=1, hh'=1 (mod n).
 * @author Sean A. Irvine
 */
public class A075443 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sum = sum.add(Math.abs(k - LongUtils.modInverse(k, mN)));
      }
    }
    return sum.divide2();
  }
}
