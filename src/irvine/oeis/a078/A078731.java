package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a006.A006512;

/**
 * A078731 Sum of primes between successive pairs of twin primes.
 * @author Sean A. Irvine
 */
public class A078731 extends A006512 {

  @Override
  public Z next() {
    Z p = super.next(); // upper of twin
    if (p.equals(Z.FIVE)) {
      return Z.ZERO; // handle only overlapping case
    }
    Z sum = Z.ZERO;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mPrime.isPrime(p.add(2))) {
        return sum;
      }
      sum = sum.add(p);
    }
  }
}
