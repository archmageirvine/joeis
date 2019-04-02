package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007048 Number of irreducible positions of size n in Montreal solitaire.
 * @author Sean A. Irvine
 */
public class A007048 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    final long kh = k * (k + 1) / 2;
    if (n == kh) {
      return Z.ONE;
    } else if (n < kh) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long r = k - 1; r * (r + 1) <= 2 * n; ++r) {
      if (r > 0) {
        sum = sum.add(get(n - k, r).multiply(Binomial.binomial(r + 1, k)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}
