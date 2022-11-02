package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060192 Union_i p(4i+2), p(4i+3), where p(k) = k-th prime.
 * @author Sean A. Irvine
 */
public class A060192 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mStep = 3;
  private long mP = 2;

  @Override
  public Z next() {
    if (mP == 2) {
      mP = 3;
    } else {
      mStep = 4 - mStep;
      for (int k = 0; k < mStep; ++k) {
        mP = mPrime.nextPrime(mP);
      }
    }
    return Z.valueOf(mP);
  }
}
