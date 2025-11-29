package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080082 Smallest prime p such that there is a gap of exactly 2*prime(n) between p and the next prime.
 * @author Sean A. Irvine
 */
public class A080082 extends A000040 {

  @Override
  public Z next() {
    final long gap = 2 * super.next().longValue();
    long p = 2;
    while (true) {
      final long q = mPrime.nextPrime(p);
      if (q - p == gap) {
        return Z.valueOf(p);
      }
      p = q;
    }
  }
}

