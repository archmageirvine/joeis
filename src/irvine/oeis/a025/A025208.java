package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025208 a(n) = [ (n-2)nd elementary symmetric function of {log(k)} ], k = 2,3,...,n.
 * @author Sean A. Irvine
 */
public class A025208 extends MemoryFunctionSequence<Long, CR> {

  /** Construct the sequence. */
  public A025208() {
    super(2);
  }

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
      sum = sum.add(sym(prod.multiply(get(b)), b + 1, max, n - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return sym(CR.ONE, 2, ++mN, mN - 2).floor();
  }
}
