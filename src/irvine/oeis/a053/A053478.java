package irvine.oeis.a053;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A053478 Sum of iterates when phi, A000010, is iterated until fixed point 1.
 * @author Sean A. Irvine
 */
public class A053478 extends MemoryFunction1Sequence<Long> {

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 1 ? n : n + get((int) Euler.phiAsLong(n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

