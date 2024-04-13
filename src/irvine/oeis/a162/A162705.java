package irvine.oeis.a162;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A162705 Numbers that are the sum of two reversed consecutive primes in more than one way.
 * @author Sean A. Irvine
 */
public class A162705 extends Sequence1 {

  private final LongDynamicByteArray mC = new LongDynamicByteArray();
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mLim = 1;
  private long mN = 581;

  private void extend(final long n) {
    while (n > mLim) {
      mLim *= 10;
      while (mP < mLim) {
        final long a = Functions.REVERSE.l(mP);
        mP = mPrime.nextPrime(mP);
        final long b = a + Functions.REVERSE.l(mP);
        final int c = mC.get(b);
        if (c == 0) {
          mC.set(b, (byte) 1);
        } else if (c == 1) {
          mC.set(b, (byte) 2);
        }
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      extend(++mN);
      if (mC.get(mN) > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

