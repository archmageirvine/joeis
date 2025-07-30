package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A079098 Conjectured values of greatest k such that for any consecutive primes q, q', k &lt;= q &lt; q', sqrt(q')-sqrt(q) &lt; 1/n.
 * @author Sean A. Irvine
 */
public class A079098 extends Sequence1 implements Conjectural {

  // This sequence is conjectural by definition

  private static final long HEURISTIC = 10;
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mPrev = 1;

  @Override
  public Z next() {
    ++mN;
    for (long p = mPrev; p < HEURISTIC * mPrev; p = mPrime.nextPrime(p)) {
      if (CR.valueOf(mPrime.nextPrime(p)).sqrt().subtract(CR.valueOf(p).sqrt()).multiply(mN).compareTo(CR.ONE) >= 0) {
        mPrev = p;
      }
    }
    return Z.valueOf(mPrev);
  }
}
