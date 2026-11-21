package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087516 Consider pairs (i,j) such that j*prime(i)# - prime(i+2) and j*prime(i)# - prime(i+1) are consecutive primes and 0 &lt; j &lt; prime(i+1), where prime(r)# = r-th primorial number (A002110). Sequence gives prime(i) values.
 * @author Sean A. Irvine
 */
public class A087516 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mI = 0;
  private long mP = 1;
  private long mQ = 2;
  private long mR = 3;
  private long mJ = 1;
  private Z mPrimorial = Z.ONE;

  protected Z select(final long p, final long j) {
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mJ >= mQ) {
        mPrimorial = mPrimorial.multiply(mQ);
        mP = mQ;
        mQ = mR;
        mR = mPrime.nextPrime(mR);
        mJ = 1;
        ++mI;
      }
      final Z jp = mPrimorial.multiply(mJ);
      final Z t = jp.subtract(mR);
      if (t.isProbablePrime()) {
        final Z u = jp.subtract(mQ);
        if (u.isProbablePrime() && mPrime.nextPrime(t).equals(u)) {
          return select(mP, mJ);
        }
      }
    }
  }
}

