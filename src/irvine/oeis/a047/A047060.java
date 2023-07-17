package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A047060 Array T read by diagonals: T(h,k)=number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and no step touches the line y=5x/3 unless x=0 or x=h.
 * @author Sean A. Irvine
 */
public class A047060 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A047060() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A047060(final int offset) {
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
    if (5 * n - 1 != 3 * m && 5 * n - 2 != 3 * m && 5 * n - 3 != 3 * m && 5 * n - 4 != 3 * m && 5 * n - 5 != 3 * m) {
      s = s.add(get(n - 1, m));
    }
    if (5 * n != 3 * m - 3 && 5 * n != 3 * m - 2 && 5 * n != 3 * m - 1) {
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
