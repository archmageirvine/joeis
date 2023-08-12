package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A065069 Numbers n such that Fibonacci(n) is not squarefree, but for all proper divisors k of n, Fibonacci(k) is squarefree.
 * @author Sean A. Irvine
 */
public class A065069 extends Sequence1 {

  private final MemorySequence mFibonacci = MemorySequence.cachedSequence(new A000045());
  private int mN = 0;

  private boolean is(final int n) {
    if (n <= 1) {
      return false;
    }
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d > 1 && (d < n) != Jaguar.factor(mFibonacci.a(d)).isSquareFree()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

