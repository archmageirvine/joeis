package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045778 Number of factorizations of n into distinct factors greater than 1.
 * @author Sean A. Irvine
 */
public class A045778 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    Z t = n > m ? Z.ZERO : Z.ONE;
    if (mPrime.isPrime(n)) {
      return t;
    }
    for (final Z dd : Cheetah.factor(n).divisors()) {
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
