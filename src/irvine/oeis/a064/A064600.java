package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.memory.MemorySequence;
import irvine.util.array.DynamicIntArray;

/**
 * A064600 a(n) indicates the position of 5 after n iterations of A064553.
 * @author Sean A. Irvine
 */
public class A064600 extends Sequence0 {

  // WARNING: At some point the DynamicIntArray here could overflow either
  // in range of index when looking for 5 or because an entry exceeds 31
  // bits.

  private final Fast mPrime = new Fast();
  private MemorySequence mA = null;

  private MemorySequence iterate(final MemorySequence a) {
    if (a == null) {
      // Fake memory sequence for positive integers
      return new MemorySequence() {
        @Override
        protected Z computeNext() {
          return null;
        }

        @Override
        public Z a(final int n) {
          return Z.valueOf(n + 1);
        }
      };
    } else {
      return new MemorySequence() {
        private final DynamicIntArray mSeq = new DynamicIntArray();
        private int mPrimeIndex = 1;
        private int mN = -1;

        @Override
        protected Z computeNext() {
          final int n = a.a(++mN).intValueExact();
          if (n == 1) {
            mSeq.set(n, 1);
          } else if (mPrime.isPrime(n)) {
            mSeq.set(n, ++mPrimeIndex);
          } else {
            int d = 2;
            while (n % d != 0) {
              ++d;
            }
            mSeq.set(n, mSeq.get(d) * mSeq.get(n / d));
          }
          return Z.valueOf(mSeq.get(n));
        }
      };
    }
  }

  @Override
  public Z next() {
    mA = iterate(mA);
    int m = 0;
    while (!Z.FIVE.equals(mA.a(m))) {
      ++m;
    }
    return Z.valueOf(m + 1);
  }
}
