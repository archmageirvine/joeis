package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A002302 Generalized tangent numbers.
 * @author Sean A. Irvine
 */
public class A002302 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002302(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002302() {
    super(3);
  }

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).multiply(k - 1).add(get(n - 1, k + 1).multiply(k + 1));
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN + 4, mN);
  }
}
