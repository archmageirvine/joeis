package irvine.oeis.a022;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022661 Expansion of Product_{m&gt;=1} (1-m*q^m).
 * @author Sean A. Irvine
 */
public class A022661 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k * (k + 1) / 2 < n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    final Z t = get(n, k - 1);
    return k > n ? t : t.subtract(get(n - k, k - 1).multiply(k));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
