package irvine.oeis.a036;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036602 Triangle of coefficients of generating function of binary rooted trees of height at most n.
 * @author Sean A. Irvine
 */
public class A036602 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long h) {
    if (n < 2) {
      return Z.valueOf(n);
    }
    if (h < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long i = 0; i <= n / 2; ++i) {
      sum = sum.add(get(i, h - 1).multiply(get(n - i, h - 1)));
    }
    if ((n & 1) == 0) {
      final Z t = get(n / 2, h - 1);
      sum = sum.add(t.multiply(Z.ONE.subtract(t)).divide2());
    }
    return sum;
  }

  protected Z t(final long n, final long k) {
    return get(k + 1, n);
  }

  @Override
  public Z next() {
    if (++mM >= 1L << mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
