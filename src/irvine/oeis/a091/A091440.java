package irvine.oeis.a091;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091440 Smallest number m such that m#/phi(m#) &gt;= n, where m# indicates the primorial (A034386) of m and phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A091440 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    Z primorial = Z.ONE;
    Z phiN = Z.valueOf(mN);
    while (true) {
      if (primorial.compareTo(phiN) >= 0) {
        return Z.valueOf(k);
      }
      k = mPrime.nextPrime(k);
      primorial = primorial.multiply(k);
      phiN = phiN.multiply(k - 1);
    }
  }
}
