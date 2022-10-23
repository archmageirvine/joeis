package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074036 Sum of the primes from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074036 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Z min = Z.valueOf(mN);
    Z max = Z.ZERO;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      if (p.compareTo(min) < 0) {
        min = p;
      }
      if (p.compareTo(max) > 0) {
        max = p;
      }
    }
    Z s = min;
    while ((min = mPrime.nextPrime(min)).compareTo(max) <= 0) {
      s = s.add(min);
    }
    return s;
  }
}
