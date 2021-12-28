package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053478 Sum of iterates when phi, A000010, is iterated until fixed point 1.
 * @author Sean A. Irvine
 */
public class A053478 extends MemoryFunction1<Long> implements Sequence {

  private int mN = 0;

  @Override
  protected Long compute(final int n) {
    return n <= 1 ? n : n + get((int) LongUtils.phi(n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN));
  }
}

