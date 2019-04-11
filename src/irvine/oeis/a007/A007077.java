package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007077 Optimal cost of search tree for searching <code>an</code> ordered array of n elements with cost k of probing element k.
 * @author Sean A. Irvine
 */
public class A007077 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long d) {
    if (n == 0) {
      return Z.ZERO;
    }
    Z min = null;
    for (long r = 1; r <= n; ++r) {
      final Z t = get(r - 1, d).add(get(n - r, r + d)).add(Z.valueOf(n).multiply(r + d));
      min = min == null ? t : min.min(t);
    }
    return min;
  }

  @Override
  public Z next() {
    return get(++mN, 0L);
  }
}
