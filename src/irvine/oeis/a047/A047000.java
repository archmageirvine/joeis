package irvine.oeis.a047;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047000 Array T read by diagonals; T(h,k)=number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and no step touches the line y=x/2 except at the endpoints.
 * @author Sean A. Irvine
 */
public class A047000 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    if (n - 1 != 2 * m) {
      s = s.add(get(n - 1, m));
    }
    if (n != 2 * m - 2 && n != 2 * m - 1) {
      s = s.add(get(n, m - 1));
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
