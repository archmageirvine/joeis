package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A059419 Triangle T(n,k) (1 &lt;= k &lt;= n) of tangent numbers, read by rows: T(n,k) = coefficient of x^n/n! in expansion of (tan x)^k/k!.
 * @author Sean A. Irvine
 */
public class A059419 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A059419(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A059419() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n.equals(k)) {
      return Z.ONE;
    }
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    return get(n - 1, k - 1).add(get(n - 1, k + 1).multiply(k).multiply(k + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
