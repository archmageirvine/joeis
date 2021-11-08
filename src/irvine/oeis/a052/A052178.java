package irvine.oeis.a052;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052178 Number of walks of length n on the simple cubic lattice terminating at height 2 above the (x,y)-plane.
 * @author Sean A. Irvine
 */
public class A052178 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    return get(n - 1, m - 1).add(get(n - 1, m).multiply(4)).add(get(n - 1, m + 1));
  }

  @Override
  public Z next() {
    return get(++mN, 2L);
  }
}
