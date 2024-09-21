package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A072275 Least m such that one less than m-th prime has n divisors (or 0 if no such prime exists).
 * @author Sean A. Irvine
 */
public class A072275 extends A000040 {

  private final Fast mPrime = new Fast();
  private final LongDynamicArray<Long> mFirst = new LongDynamicArray<>();
  private long mN = 0;
  private long mM = 0;
  {
    setOffset(2);
  }

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN) && mN > 5 && mN != 17 && mN != 257 && mN != 65537) {
      return Z.ZERO;
    }
    while (mFirst.get(mN) == null) {
      final Z p = super.next();
      ++mM;
      final long s = Functions.SIGMA0.l(p.subtract(1));
      if (mFirst.get(s) == null) {
        mFirst.set(s, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}

