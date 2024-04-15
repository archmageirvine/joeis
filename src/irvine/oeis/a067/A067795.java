package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067795 Numbers n such that 2*n+1 is the next prime after sigma(n).
 * @author Sean A. Irvine
 */
public class A067795 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.nextPrime(Functions.SIGMA.z(++mN)).equals(Z.valueOf(2 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
