package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A047030 Array T read by diagonals: T(h,k)=number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and no step touches the line y=x/4 unless x=0 or x=h.
 * @author Sean A. Irvine
 */
public class A047030 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A047030() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A047030(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    if (n - 1 != 4 * m) {
      s = s.add(get(n - 1, m));
    }
    if (n != 4 * m - 4 && n != 4 * m - 3 && n != 4 * m - 2 && n != 4 * m - 1) {
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
