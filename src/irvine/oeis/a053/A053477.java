package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A053477 Sum of iterates of divisor number function A000005.
 * @author Sean A. Irvine
 */
public class A053477 extends MemoryFunction1Sequence<Long> {

  /** Construct the sequence. */
  public A053477() {
    super(1);
  }

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 2 ? n : n + get((int) Functions.SIGMA0.l(n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

