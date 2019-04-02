package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000006 Integer part of square root of n-th prime.
 * @author Sean A. Irvine
 */
public class A000006 implements Sequence {

  private Z mN = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN = mPrime.nextPrime(mN);
    return mN.sqrt();
  }
}

