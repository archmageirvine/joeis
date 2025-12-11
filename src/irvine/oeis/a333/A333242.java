package irvine.oeis.a333;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333242 Prime numbers with an odd number of steps in their prime index chain.
 * @author Sean A. Irvine
 */
public class A333242 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunction1<Long> mB = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return Predicates.PRIME.is(n) ? 1 + get(Functions.PRIME_PI.i(n)) : 0;
    }
  };
  private final MemoryFunction1<Long> mA = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      if (n <= 1) {
        return 2L;
      }
      long p = mA.get(n - 1);
      while (true) {
        p = Functions.NEXT_PRIME.l(p);
        if ((mB.get((int) p) & 1) == 1) {
          return p;
        }
      }
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mA.get(++mN));
  }
}
