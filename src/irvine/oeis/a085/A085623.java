package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085623 Let p = n-th prime; a(n) = number of pairs (i,j) with 0 &lt; i &lt; p, 0 &lt; j &lt; p such that i*j == 1 mod p and i and j have opposite parity.
 * @author Sean A. Irvine
 */
public class A085623 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long cnt = 0;
    for (long k = 1; k < mP; k += 2) {
      for (long j = 2; j < mP; j += 2) {
        if ((k * j) % mP == 1) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt).multiply2();
  }
}
