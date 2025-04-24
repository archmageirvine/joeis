package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076960 a(n) is the number of primes between n! and (2n)!.
 * @author Sean A. Irvine
 */
public class A076960 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final Z lim = Functions.FACTORIAL.z(2 * ++mN);
    for (Z p = mPrime.nextPrime(Functions.FACTORIAL.z(mN)); p.compareTo(lim) < 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

