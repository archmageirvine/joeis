package irvine.oeis.a046;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046746.
 * @author Sean A. Irvine
 */
public class A046746 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    Z r = n.equals(m) ? Z.valueOf(n) : Z.ZERO;
    if (m >= 1) {
      r = r.add(get(n, m - 1));
      if (n >= m) {
        r = r.add(get(n - m, m));
      }
    }
    return r;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
