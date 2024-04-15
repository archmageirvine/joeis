package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A066814 Smallest prime p such that (p-1) has n divisors, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A066814 extends A000040 {

  private final Fast mPrime = new Fast();
  private final LongDynamicArray<Z> mFirst = new LongDynamicArray<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN) && mN > 5 && mN != 17 && mN != 257 && mN != 65537) {
      return Z.ZERO;
    }
    while (mFirst.get(mN) == null) {
      final Z p = super.next();
      final long s = Functions.SIGMA0.l(p.subtract(1));
      if (mFirst.get(s) == null) {
        mFirst.set(s, p);
      }
    }
    return mFirst.get(mN);
  }
}

