package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A028417 Sum over all n! permutations of n elements of minimum lengths of cycles.
 * @author Sean A. Irvine
 */
public class A028417 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A028417() {
    super(1);
  }

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.valueOf(m);
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (long j = 1; j <= n; ++j) {
      sum = sum.add(get(n - j, Math.min(m, j)).multiply(Binomial.binomial(n - 1, j - 1)).multiply(f));
      f = f.multiply(j);
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
