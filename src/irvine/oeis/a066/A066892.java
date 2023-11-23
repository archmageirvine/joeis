package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A066863.
 * @author Sean A. Irvine
 */
public class A066892 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 1000;
  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 0;
    long p = mP;
    long q = 1;
    long max = 0;
    long cnt = 0;
    while (k < max + HEURISTIC) {
      p = mPrime.nextPrime(p);
      q = mPrime.nextPrime(q);
      if ((p - q) % ++k == 0) {
        max = k;
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
