package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060646 Bonse sequence: a(n) = minimal j such that n-j+1 &lt; prime(j).
 * @author Sean A. Irvine
 */
public class A060646 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 1;
  private long mJ = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN - mJ >= mP) {
      mP = mPrime.nextPrime(mP);
      ++mJ;
    }
    return Z.valueOf(mJ);
  }
}

