package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391351 Numbers k such that 3*k - (greatest prime &lt; 3*k) &lt; (least prime &gt; 3*k) - 3*k.
 * @author Sean A. Irvine
 */
public class A391351 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long m = 3 * ++mN;
      if (m - mPrime.prevPrime(m) < mPrime.nextPrime(m) - m) {
        return Z.valueOf(mN);
      }
    }
  }
}
