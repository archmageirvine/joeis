package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a060.A060681;

/**
 * A074195 Sum of the primes from smallest prime factor of n to the largest prime factor of n = largest difference between consecutive divisors of n (ordered by size).
 * @author Sean A. Irvine
 */
public class A074195 extends A060681 {

  private final A074036 mSeq = new A074036();
  {
    mSeq.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mSeq.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
