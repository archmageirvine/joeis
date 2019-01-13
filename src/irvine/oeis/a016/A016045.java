package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016045.
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
