package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050447 Array read by upward antidiagonals. A(n, k) = A(n, k-1) + Sum_{j=0..floor((n-1)/2)} A(2*j, k-1) * A(n-1-2*j, k) for n, k &gt; 0, otherwise 1 for n = 0 or k = 0.
 * @author Sean A. Irvine
 */
public class A050447 extends MemoryFunction2Sequence<Long, Z> {

  // Using column labels of Kreweras
  @Override
  protected Z compute(final Long n, final Long r) {
    if (r < 2) {
      return Z.ZERO;
    }
    if (n == 0 || r == 2) {
      return Z.ONE;
    }
    Z sum = get(n, r - 1);
    for (long k = 0; k <= (n - 1) / 2; ++k) {
      sum = sum.add(get(2 * k, r - 1).multiply(get(n - 1 - 2 * k, r)));
    }
    return sum;
  }

  private long mR = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN + 1 >= mR) {
      ++mR;
      mN = 0;
    }
    return get(mN, mR - mN);
  }
}

