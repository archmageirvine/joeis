package irvine.oeis.a340;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A340959 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A340959 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mPrime.nextPrime(Z.valueOf(mN - mM).pow(mM).subtract(1));
  }
}
