package irvine.oeis.a036;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A036368 Number of chiral orthoplex n-ominoes in n-2 space.
 * @author Sean A. Irvine
 */
public class A036368 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 3;

  private Z s(final long n, final long k) {
    return get(n + 1 - k, 1L).signedAdd((k & 1) == 0, n < 2 * k ? Z.ZERO : s(n - k, k));
  }

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k == 1) {
      if (n == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long j = 1; j < n; ++j) {
        sum = sum.add(get(j, 1L).multiply(s(n - 1, j)).multiply(j));
      }
      return sum.divide(n - 1);
    }
    Z sum = Z.ZERO;
    for (long j = 1; j < n; ++j) {
      sum = sum.add(get(j, 1L).multiply(get(n - j, k - 1)));
    }
    return sum;
  }

  private Z inner(final long j) {
    Z sum = Z.ZERO;
    for (long k = 5; k <= mN; k += 2) {
      sum = sum.add(get(j, (k - 1) / 2).multiply(get(mN - 2 * j, 1L)));
    }
    return sum.multiply((j & 1) == 0 ? 4 : -4);
  }

  @Override
  public Z next() {
    final Z a = get(++mN, 4L);
    Z b = Z.ZERO;
    for (long j = 5; j <= mN; ++j) {
      b = b.add(get(mN, j));
    }
    b = b.multiply(4);
    if ((mN & 1) == 0) {
      final long i2 = mN / 2;
      Z c = Z.ZERO;
      for (long j = 3; j <= i2; ++j) {
        c = c.add(get(i2, j));
      }
      c = c.multiply((i2 & 1) == 0 ? 4 : -4);
      c = c.signedAdd((i2 & 1) == 0, get(i2, 2L));
      if ((mN & 3) == 0) {
        c = c.signedAdd((mN & 4) == 0, get(mN / 4, 1L).multiply2());
      }
      b = b.subtract(c);
    }
    Z d = Z.ZERO;
    for (long j = 1; j <= (mN - 1) / 2; ++j) {
      d = d.signedAdd((j & 1) == 0, get(j, 1L).multiply(get(mN - 2 * j, 2L)).multiply2());
      d = d.subtract(inner(j));
    }
    return a.add(b).add(d).divide(8);
  }
}
