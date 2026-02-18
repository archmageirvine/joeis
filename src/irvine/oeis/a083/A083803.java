package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083803 Smallest number k such that the concatenations k 2n-1 and 2n-1 k are both primes, or 0 if n = 5m+3.
 * @author Sean A. Irvine
 */
public class A083803 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 5 == 3) {
      return Z.ZERO;
    }
    final String s = String.valueOf(2 * mN - 1);
    long k = 0;
    while (true) {
      ++k;
      if (new Z(k + s).isProbablePrime() && new Z(s + k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
