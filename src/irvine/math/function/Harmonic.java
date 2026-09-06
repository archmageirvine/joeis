package irvine.math.function;

import irvine.math.q.Q;
import irvine.util.array.LongDynamicArray;

/**
 * Harmonic numbers.
 * @author Sean A. Irvine
 */
public class Harmonic extends AbstractFunctionQ1 {

  private final LongDynamicArray<Q> mB = new LongDynamicArray<>();
  {
    mB.set(0, Q.ZERO);
  }

  @Override
  public Q q(final long n) {
    while (n >= mB.length()) {
      final long m = mB.length();
      mB.set(m, mB.get(m - 1).add(new Q(1, m)));
    }
    return mB.get(n);
  }
}

