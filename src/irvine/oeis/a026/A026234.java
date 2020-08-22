package irvine.oeis.a026;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a018.A018252;

/**
 * A026234 In the sequence of positive integers, swap the k-th prime and k-th nonprime, for k = 1,2,3,...
 * @author Sean A. Irvine
 */
public class A026234 implements Sequence {

  private final Fast mPrime = new Fast();
  private final Sequence mSeqPrimes = new A000040();
  private final Sequence mSeqNonprime = new A018252();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mP) {
      mP = mPrime.nextPrime(mP);
      return mSeqNonprime.next();
    } else {
      return mSeqPrimes.next();
    }
  }
}
