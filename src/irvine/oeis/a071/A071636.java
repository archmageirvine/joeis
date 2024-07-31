package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;

/**
 * A071532.
 * @author Sean A. Irvine
 */
public class A071636 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -2;

  private boolean is(final long n) {
    final Sequence s = new A002144();
    long p;
    while ((p = s.next().longValueExact()) * 2 <= mN) {
      if (mPrime.isPrime(mN - p)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
