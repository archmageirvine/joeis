package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069807 Smallest k&gt;n such that prime(n)+1 divides prime(k)+1.
 * @author Sean A. Irvine
 */
public class A069807 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    long q = mP;
    long k = mN;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if ((q + 1) % (mP + 1) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

