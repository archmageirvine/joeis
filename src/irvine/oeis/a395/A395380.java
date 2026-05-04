package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395380 a(1) = 4; for n &gt; 1, a(n) is the number of integers k in [prime(n-1)^8..prime(n)^8 - 1] with exactly 9 divisors.
 * @author Sean A. Irvine
 */
public class A395380 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z start = mP.pow(8);
    mP = mPrime.nextPrime(mP);
    final Z end = mP.pow(8);
    long cnt = 0;
    for (Z k = start; k.compareTo(end) < 0; k = k.add(1)) {
      if (Functions.SIGMA0.l(k) == 9) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
