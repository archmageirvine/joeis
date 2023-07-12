package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025198 [ (n-1)st elementary symmetric function of {sqrt(k)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025198 extends MemoryFunctionSequence<Long, CR> {

  /** Construct the sequence. */
  public A025198() {
    super(1);
  }

  private long mN = 0;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).sqrt();
  }

  private CR sym(final CR prod, final long a, final long max, final long n) {
    if (n == 0) {
      return prod;
    }
    CR sum = CR.ZERO;
    for (long b = a; b <= max; ++b) {
      sum = sum.add(sym(prod.multiply(get(b)), b + 1, max, n - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return sym(CR.ONE, 0, ++mN, mN - 1).floor();
  }
}
