package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066689 Least number k such that the square root of {k^2 + (Prime[n + k] - Prime[n])^2} is an integer; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A066689 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 0;
    long q = mP;
    while (true) {
      q = mPrime.nextPrime(q);
      final long u = q - mP;
      if (LongUtils.isSquare(++k * k + u * u)) {
        return Z.valueOf(k);
      }
    }
  }
}
