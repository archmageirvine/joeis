package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087371 Smallest k such that 10^k + 2n-1 is a prime &gt;10, or 0 if no such k exists. Index of the smallest power of 10 which when increased by the n-th odd number yields a prime.
 * @author Sean A. Irvine
 */
public class A087371 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 0 || (9 + 2 * mN) % 5 == 0) {
      return Z.ZERO;
    }
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply(10);
      if (t.add(2 * mN - 1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
