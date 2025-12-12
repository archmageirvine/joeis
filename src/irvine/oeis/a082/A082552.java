package irvine.oeis.a082;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082552 Number of sets of distinct primes, the greatest of which is prime(n), whose arithmetic mean is an integer.
 * @author Sean A. Irvine
 */
public class A082552 extends Sequence1 {

  // After Alois P. Heinz

  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int t, final int i, final int m, final int h) {
      if (h == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      } else if (i < 1 || h > i) {
        return Z.ZERO;
      } else {
        return get(t, i - 1, m, h).add(get((t + Functions.PRIME.i(i)) % m, i - 1, m, h - 1));
      }
    }
  };

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, m -> mB.get(Functions.PRIME.i(mN) % m, mN - 1, m, m - 1));
  }
}
