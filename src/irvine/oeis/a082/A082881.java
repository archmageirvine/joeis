package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075860;

/**
 * A082881 Least value of A075860(j) when j runs through composite numbers between n-th and (n+1)-th primes. That is, the smallest fixed-point[=prime] reached by iteration of function A008472(=sum of prime factors) initiated with composite values between two consecutive primes.
 * @author Sean A. Irvine
 */
public class A082881 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A075860().skip(2);
  private long mP = 2;
  private long mM = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z min = null;
    while (mM < mP) {
      ++mM;
      final Z t = mA.next();
      if (!mPrime.isPrime(mM) && (min == null || t.compareTo(min) < 0)) {
        min = t;
      }
    }
    return min == null ? Z.ZERO : min;
  }
}
