package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A047089 Array T read by antidiagonals: T(h,k)=number of paths consisting of steps from (0,0) to (h,k) such that each step has length 1 directed up or right and touches the line y=x/2 only at lattice points.
 * @author Sean A. Irvine
 */
public class A047089 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A047089() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A047089(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    Z s = get(n - 1, m - 1);
    if ((n + 1) % 3 != 0 || n != m + (n + 1) / 3) {
      s = s.add(get(n - 1, m));
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
