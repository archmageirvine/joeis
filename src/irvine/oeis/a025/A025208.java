package irvine.oeis.a025;

import irvine.math.MemoryFunction;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025208.
 * @author Sean A. Irvine
 */
public class A025208 extends MemoryFunction<Long, CR> implements Sequence {

  private long mN = 1;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).log();
  }

  private CR sym(final CR prod, final long a, final long max, final long n) {
    if (n == 0) {
      return prod;
    }
    CR sum = CR.ZERO;
    for (long b = a; b <= max; ++b) {
      sum = sum.add(sym(prod.multiply(getValue(b)), b + 1, max, n - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return sym(CR.ONE, 2, ++mN, mN - 2).floor();
  }
}
