package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Z;

/**
 * A053477 Sum of iterates of divisor number function A000005.
 * @author Sean A. Irvine
 */
public class A053477 extends MemoryFunction1Sequence<Long> {

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 2 ? n : n + get((int) Jaguar.factor(n).sigma0AsLong());
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

