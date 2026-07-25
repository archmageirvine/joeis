package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086101 Numbers j such that the concatenation of the last digit of p(j) and the first digit of prime(j+1) is a prime.
 * @author Sean A. Irvine
 */
public class A086101 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final String q = mPrime.nextPrime(p).toString();
      if (mPrime.isPrime(p.mod(10) * 10 + q.charAt(0) - '0')) {
        return Z.valueOf(mN);
      }
    }
  }
}

