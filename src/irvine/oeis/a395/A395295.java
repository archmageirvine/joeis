package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001175;

/**
 * A395295 allocated for Jason D. Andoyo.
 * @author Sean A. Irvine
 */
public class A395295 extends Sequence1 {

  private long mP = 2;

  private long l(final long k, final long p) {
    long sum = 0;
    final long end = A001175.pisanoPeriod(p);
    for (long i = 0; i < end; ++i) {
      if (Functions.KRONECKER.l(Fibonacci.fibonacci(i, p), p) == k) {
        ++sum;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.l(mP);
    return Z.valueOf(l(1, mP) - l(-1, mP) - l(0, mP));
  }
}

