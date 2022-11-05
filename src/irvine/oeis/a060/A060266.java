package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060266 Difference between 2n and the following prime.
 * @author Sean A. Irvine
 */
public class A060266 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mPrime.nextPrime(mN) - mN);
  }
}
