package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001918 Least positive primitive root of n-th prime.
 * @author Sean A. Irvine
 */
public class A001918 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return ZUtils.leastPrimitiveRoot(mP);
  }
}
