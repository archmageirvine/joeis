package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007796.
 * @author Sean A. Irvine
 */
public class A007796 implements Sequence {

  private long mP = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mP == 0 ? 1 : mPrime.nextPrime(mP);
    final String a = String.valueOf(mP);
    mP = mPrime.nextPrime(mP);
    return new Z(mP + a);
  }
}
