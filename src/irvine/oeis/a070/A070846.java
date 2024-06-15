package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070846 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final long mMultiplier;
  private long mN = 0;

  protected A070846(final long multiplier) {
    mMultiplier = multiplier;
  }

  /** Construct the sequence. */
  public A070846() {
    this(2);
  }

  @Override
  public Z next() {
    mN += mMultiplier;
    long p = mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p % mN == 1) {
        return Z.valueOf(p);
      }
    }
  }
}
