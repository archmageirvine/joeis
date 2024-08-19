package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071850 Smallest k &gt; n such that n divides prime(k) - prime(n).
 * @author Sean A. Irvine
 */
public class A071850 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long p = super.next().longValueExact();
    long q = p;
    long k = mN;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if ((q - p) % mN == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
