package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A033833 Highly factorable numbers: numbers with a record number of proper factorizations.
 * @author Sean A. Irvine
 */
public class A033833 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A033833() {
    super(1);
  }

  protected Z mPrevBest = Z.ZERO;
  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d > 1 && d >= m) {
        sum = sum.add(get(n / d, d));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      final Z cnt = get(++mN, 1L);
      if (cnt.compareTo(mPrevBest) > 0) {
        mPrevBest = cnt;
        return Z.valueOf(mN);
      }
    }
  }

}
