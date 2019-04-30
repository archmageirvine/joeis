package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016045 <code>a(n) =</code> smallest prime <code>p(k)</code> such that the gaps between the primes <code>p(k), p(k+1), p(k+2), ..., p(k+n)</code> are <code>2, 4, 6, ... 2n</code>.
 * @author Sean A. Irvine
 */
public class A016045 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    outer:
    while (true) {
      Z q = mP;
      Z delta = Z.TWO;
      for (int k = 1; k <= mN; ++k, delta = delta.add(2L * k)) {
        q = mPrime.nextPrime(q);
        if (!q.subtract(mP).equals(delta)) {
          mP = mPrime.nextPrime(mP);
          continue outer;
        }
      }
      return mP;
    }
  }
}
