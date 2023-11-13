package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066836 Least number k such that k divides the average of prime(k-n) and prime(k+n).
 * @author Sean A. Irvine
 */
public class A066836 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mP = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mPrime.nextPrime(mP));
    long k = mN;
    long s = 1;
    long t = mP;
    while (true) {
      s = mPrime.nextPrime(s);
      t = mPrime.nextPrime(t);
      if ((s + t) % (2 * ++k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
