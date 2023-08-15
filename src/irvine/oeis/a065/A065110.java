package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065110 If n = D0*10^0 + D1*10^1 + D2*10^2 + .. + Dk*10^k define f(n) = D0*0^10 + D1*1^10 + D2*2^10 + .. + Dk*k^10 (e.g. if n = 421 then f(n) = 4*2^10 + 2*1^10 + 1*0^10 = 4098). Sequence gives values of n such that f(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A065110 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      long m = mN;
      Z sum = Z.ZERO;
      long k = -1;
      while (m != 0) {
        sum = sum.add(Z.valueOf(++k).modPow(Z.TEN, n).modMultiply(m % 10, n)).mod(n);
        m /= 10;
      }
      if (sum.isZero()) {
        return n;
      }
    }
  }
}
