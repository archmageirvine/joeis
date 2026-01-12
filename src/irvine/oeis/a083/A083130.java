package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083130 Consider triangle in which n-th row contains the smallest set of n consecutive numbers whose LCM is divisible by primorial(n) (the product of first n primes). Sequence contains the first column.
 * @author Sean A. Irvine
 */
public class A083130 extends Sequence1 {

  private int mN = 0;

  private boolean is(final long start, final long end, final long p) {
    if (p <= 1) {
      return true;
    }
    long t = (start / p) * p;
    if (t < start) {
      t += p;
    }
    return t < end && is(start, end, Functions.PREV_PRIME.l(p));
  }

  private boolean is(final long start, final int n) {
    final long p = Functions.PRIME.l(n);
    return is(start, start + n, p);
  }

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      if (is(++m, mN)) {
        return Z.valueOf(m);
      }
    }
  }
}

