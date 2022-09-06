package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A058953 p is prime; x&gt;=0; n = p*2^x; m is 0 or 1; n such that tau(n)-m = A058933(n), where tau(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A058953 extends A058933 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN == 2) {
        return Z.TWO;
      }
      long m = mN;
      while ((m & 1) == 0) {
        m >>>= 1;
      }
      if (mPrime.isPrime(m)) {
        final Z sigma0 = Jaguar.factor(mN).sigma0();
        if (sigma0.equals(t) || sigma0.subtract(1).equals(t)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
