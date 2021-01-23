package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001039 a(n) = (p^p-1)/(p-1) where p = prime(n).
 * @author Sean A. Irvine
 */
public class A001039 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mP).pow(mP).subtract(1).divide(mP - 1);
  }
}
