package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A007046 Number of irreducible positions of size n in Montreal solitaire.
 * @author Sean A. Irvine
 */
public class A007046 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A007046() {
    super(3);
  }

  private long mN = 2;

  @Override
  protected Z compute(final Long n, final Long k) {
    final long kh = k * (k + 1) / 2;
    if (n == kh) {
      return Z.ONE;
    } else if (n < kh) {
      return Z.ZERO;
    }
    Z sum = get(n, k + 1);
    for (long r = 1; r <= k; ++r) {
      sum = sum.add(get(n - kh + r * (r - 1) / 2, r).multiply(Binomial.binomial(k + 1, r)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 2L);
  }
}
