package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A076179 2n-1 primes followed by 2n composite numbers.
 * @author Sean A. Irvine
 */
public class A076179 extends Sequence1 {

  private final Sequence mP = new A000040();
  private final Sequence mC = new A002808();
  private long mN = 0;
  private long mM = 0;
  private boolean mPrimes = false;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mPrimes = !mPrimes;
    }
    return mPrimes ? mP.next() : mC.next();
  }
}

