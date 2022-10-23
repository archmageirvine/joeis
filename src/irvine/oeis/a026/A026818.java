package irvine.oeis.a026;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026818 Largest digit of n concatenated with smallest digit of n is prime.
 * @author Sean A. Irvine
 */
public class A026818 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      int syndrome = 0;
      while (m != 0) {
        syndrome |= 1 << (m % 10);
        m /= 10;
      }
      int min = 0;
      int max = -1;
      while ((syndrome & 1) == 0) {
        ++min;
        ++max;
        syndrome >>>= 1;
      }
      if ((min & 1) == 1) {
        while (syndrome != 0) {
          ++max;
          syndrome >>>= 1;
        }
        if (mPrime.isPrime(10 * max + min)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
