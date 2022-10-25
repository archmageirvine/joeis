package irvine.oeis.a047;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047072 Array A read by diagonals: A(h,k)=number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and no step touches the line y=x unless x=0 or x=h.
 * @author Sean A. Irvine
 */
public class A047072 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    if (n - 1 != m) {
      s = s.add(get(n - 1, m));
    }
    if (n != m - 1) {
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
