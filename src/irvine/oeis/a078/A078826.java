package irvine.oeis.a078;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078826 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    final HashSet<Long> seen = new HashSet<>();
    do {
      long k = 1;
      while (k <= m) {
        k <<= 1;
        k += 1;
        final long r = m & k;
        if (mPrime.isPrime(r)) {
          seen.add(r);
        }
      }
      m >>>= 1;
    } while (m > 1);
    return Z.valueOf(seen.size());
  }
}
