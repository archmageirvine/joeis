package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071169 a(n) is the smallest number k such that prime(k) == 2*n-1 (mod phi(k)).
 * @author Sean A. Irvine
 */
public class A071169 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    long k = 1;
    while (true) {
      ++k;
      p = mPrime.nextPrime(p);
      final long phi = Functions.PHI.l(k);
      if (p % phi == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
