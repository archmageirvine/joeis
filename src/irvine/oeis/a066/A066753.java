package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066753 a(n) = least natural number k such that n + Sum_{i=1..k} prime(i) is prime if such k exists; = 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066753 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long sum = ++mN;
    long cnt = 0;
    long p = 1;
    do {
      p = mPrime.nextPrime(p);
      sum += p;
      ++cnt;
    } while (!mPrime.isPrime(sum));
    return Z.valueOf(cnt);
  }
}

