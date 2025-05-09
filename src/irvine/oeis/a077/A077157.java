package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A077157 a(0) = 1, followed by next n composite numbers followed by next n primes.
 * @author Sean A. Irvine
 */
public class A077157 extends Sequence0 {

  private final Sequence mP = new A000040();
  private final Sequence mC = new A002808();
  private long mN = 0;
  private long mPrimeCount = 0;
  private long mCompositeCount = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.ONE;
    }
    if (mPrimeCount >= mN) {
      ++mN;
      mPrimeCount = 0;
      mCompositeCount = 0;
    }
    if (mCompositeCount < mN) {
      ++mCompositeCount;
      return mC.next();
    } else {
      ++mPrimeCount;
      return mP.next();
    }
  }
}

