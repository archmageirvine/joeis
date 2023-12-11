package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049345 n written in primorial base.
 * @author Sean A. Irvine
 */
public class A049345 extends MemoryFunction2Sequence<Long, Z> {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long p) {
    if (n < p) {
      return Z.valueOf(n);
    }
    return get(n / p, mPrime.nextPrime(p)).multiply(10).add(n % p);
  }

  @Override
  public Z next() {
    if (++mN >= 2100) {
      throw new UnsupportedOperationException("Ambiguous representations");
    }
    return get(mN, 2L);
  }
}
