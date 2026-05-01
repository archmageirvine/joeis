package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395381 a(1) = 12; for n &gt; 1, a(n) is the number of integers k from [prime(n-1)^9..prime(n)^9 - 1] with exactly 10 divisors.
 * @author Sean A. Irvine
 */
public class A395381 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z start = mP.pow(9);
    mP = mPrime.nextPrime(mP);
    final Z end = mP.pow(9);
    long cnt = 0;
    for (Z k = start; k.compareTo(end) < 0; k = k.add(1)) {
      if (Functions.SIGMA0.l(k) == 10) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
