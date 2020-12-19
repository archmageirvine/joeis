package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037202 Number of lines in Pratt certificate for n-th prime.
 * @author Sean A. Irvine
 */
public class A037202 extends MemoryFunction<Long, Long> implements Sequence {

  protected final Fast mPrime = new Fast();
  protected long mP = 1;

  @Override
  protected Long compute(final Long key) {
    if (key == 2) {
      return 1L;
    }
    long sum = 1;
    for (final Z p : Cheetah.factor(key - 1).toZArray()) {
      sum += getValue(p.longValue());
    }
    return sum;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(getValue(mP));
  }
}
