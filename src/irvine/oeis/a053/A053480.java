package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053480 Sum of values when cototient function A051953 is iterated until fixed point is reached.
 * @author Sean A. Irvine
 */
public class A053480 extends MemoryFunction1<Long> implements Sequence {

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 1 ? 1L : n + get(n - (int) LongUtils.phi(n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

