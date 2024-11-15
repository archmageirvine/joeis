package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A073056 Prime(n)-th digit after decimal point in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A073056 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mPi = new A000796();
  private long mP = 1;
  private long mM = -1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mM + 1 < mP) {
      mPi.next();
      ++mM;
    }
    ++mM;
    return mPi.next();
  }
}
