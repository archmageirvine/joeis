package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A085347 Least number x so that number of primes not exceeding sigma(x) equals n.
 * @author Sean A. Irvine
 */
public class A085347 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final long t = Functions.PRIME_PI.l(Functions.SIGMA1.z(++mM));
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
