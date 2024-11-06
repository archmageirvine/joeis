package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072924 Least k such that floor((1+1/k)^n) is prime.
 * @author Sean A. Irvine
 */
public class A072924 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (mPrime.isPrime(new Q(++k + 1, k).pow(mN).floor())) {
        return Z.valueOf(k);
      }
    }
  }
}

