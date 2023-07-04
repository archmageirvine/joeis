package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.z.Z;

/**
 * A037202 Number of lines in Pratt certificate for n-th prime.
 * @author Sean A. Irvine
 */
public class A037202 extends MemoryFunctionSequence<Long, Long> {

  protected final Fast mPrime = new Fast();
  protected long mP = 1;

  @Override
  protected Long compute(final Long key) {
    if (key == 2) {
      return 1L;
    }
    long sum = 1;
    for (final Z p : Jaguar.factor(key - 1).toZArray()) {
      sum += get(p.longValue());
    }
    return sum;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(get(mP));
  }
}
