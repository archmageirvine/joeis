package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001039.
 * @author Sean A. Irvine
 */
public class A001039 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mP).pow((int) mP).subtract(1).divide(mP - 1);
  }
}
