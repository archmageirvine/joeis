package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A045778 Number of factorizations of n into distinct factors greater than 1.
 * @author Sean A. Irvine
 */
public class A045778 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    Z t = n > m ? Z.ZERO : Z.ONE;
    if (mPrime.isPrime(n)) {
      return t;
    }
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d <= m && d > 1 && d < n) {
        t = t.add(get(n / d, d - 1));
      }
    }
    return t;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
