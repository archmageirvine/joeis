package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060191 Union_i p(4i), p(4i+1), where p(k) = k-th prime.
 * @author Sean A. Irvine
 */
public class A060191 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mStep = 3;
  private long mP = 1;

  @Override
  public Z next() {
    mStep = 4 - mStep;
    for (int k = 0; k < mStep; ++k) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
