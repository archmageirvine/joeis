package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060265 Largest prime less than 2n.
 * @author Sean A. Irvine
 */
public class A060265 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mPrime.prevPrime(mN));
  }
}
