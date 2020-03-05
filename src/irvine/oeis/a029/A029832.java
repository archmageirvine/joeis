package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029832.
 * @author Sean A. Irvine
 */
public class A029832 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? CR.valueOf(mN).log().ceil() : Z.ZERO;
  }
}
