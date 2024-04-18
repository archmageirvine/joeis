package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A053480 Sum of values when cototient function A051953 is iterated until fixed point is reached.
 * @author Sean A. Irvine
 */
public class A053480 extends MemoryFunction1Sequence<Long> {

  /** Construct the sequence. */
  public A053480() {
    super(1);
  }

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 1 ? 1L : n + get(n - (int) Functions.PHI.l((long) n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

