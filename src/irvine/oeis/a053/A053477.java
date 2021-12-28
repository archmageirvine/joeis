package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053477 Sum of iterates of divisor number function A000005.
 * @author Sean A. Irvine
 */
public class A053477 extends MemoryFunction1<Long> implements Sequence {

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 2 ? n : n + get((int) Cheetah.factor(n).sigma0AsLong());
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

