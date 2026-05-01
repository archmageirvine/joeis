package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395379 a(1) = 15; for n &gt; 1, a(n) is the number of integers k in [prime(n-1)^7..prime(n)^7-1] with exactly 8 divisors.
 * @author Sean A. Irvine
 */
public class A395379 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z start = mP.pow(7);
    mP = mPrime.nextPrime(mP);
    final Z end = mP.pow(7);
    long cnt = 0;
    for (Z k = start; k.compareTo(end) < 0; k = k.add(1)) {
      if (Functions.SIGMA0.l(k) == 8) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
