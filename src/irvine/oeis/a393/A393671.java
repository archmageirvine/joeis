package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393671 a(n) = number of partitions of n into distinct prime parts, no two of which are adjacent primes.
 * @author Sean A. Irvine
 */
public class A393671 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      final Z t = get(n, i - 1);
      final int p = Functions.PRIME.i(i);
      return p > n ? t : t.add(get(n - p, i - 2));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, Functions.PRIME_PI.i(mN));
  }
}
