package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A077158 Prime(1) composite numbers, followed by composite(1) prime numbers, prime(2) composite numbers, followed by composite(2) prime numbers, ...
 * @author Sean A. Irvine
 */
public class A077158 extends Sequence1 {

  private final Sequence mP0 = new A000040();
  private final Sequence mC0 = new A002808();
  private final Sequence mP1 = new A000040();
  private final Sequence mC1 = new A002808();
  private Sequence mLimiter = mC0;
  private Sequence mSource = mP1;
  private long mLim = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    if (++mCount >= mLim) {
      mLimiter = mLimiter == mP0 ? mC0 : mP0;
      mSource = mSource == mP1 ? mC1 : mP1;
      mCount = 0;
      mLim = mLimiter.next().longValueExact();
    }
    return mSource.next();
  }
}

