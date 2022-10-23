package irvine.oeis.a026;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A026239 Beginning with the natural numbers, swap the k-th prime and k-th composite.
 * @author Sean A. Irvine
 */
public class A026239 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mSeqPrimes = new A000040();
  private final Sequence mComposites = new A002808();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mP) {
      mP = mPrime.nextPrime(mP);
      return mComposites.next();
    } else if (mN != 1) {
      return mSeqPrimes.next();
    } else {
      return Z.ONE;
    }
  }
}
