package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007902.
 * @author Sean A. Irvine
 */
public class A007902 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = 0;

  @Override
  protected Z compute(final Long k, final Long m) {
    if (k < 1) {
      return Z.ZERO;
    }
    if (m == 0) {
      final Z t = get(k - 1, 0L).multiply2().add(get(k, 1L));
      return k == 2 ? t.add(1) : t;
    }
    if (m == 1) {
      return get(k - 3, 0L).add(get(k - 2, 1L).multiply2()).add(get(k - 1, 2L)).add(get(k - 4, 1L));
    }
    return get(k - m - 2, m - 1).add(get(k - m - 1, m).multiply2()).add(get(k - m, m + 1));
  }

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : get(mN, 0L);
  }
}
