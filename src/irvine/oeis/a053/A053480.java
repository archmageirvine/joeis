package irvine.oeis.a053;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A053480 Sum of values when cototient function A051953 is iterated until fixed point is reached.
 * @author Sean A. Irvine
 */
public class A053480 extends MemoryFunction1Sequence<Long> {

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 1 ? 1L : n + get(n - (int) Euler.phiAsLong(n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

