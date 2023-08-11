package irvine.oeis.a059;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059882 As upper right triangle: ascending wiggly sums to n where first term is k (sums in which terms alternately increase and decrease; zigzag partitions).
 * @author Sean A. Irvine
 */
public class A059882 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A059882(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A059882() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  protected MemoryFunction2<Long, Z> mT = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Long n, final Long k) {
      if (n > k && k > 0) {
        Z sum = Z.ZERO;
        for (long j = k + 1; j <= n; ++j) {
          sum = sum.add(mS.get(n - k, j));
        }
        return sum;
      }
      return n > 0 && n.equals(k) ? Z.ONE : Z.ZERO;
    }
  };

  protected MemoryFunction2<Long, Z> mS = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Long n, final Long k) {
      if (n > k && k > 0) {
        Z sum = Z.ZERO;
        for (long j = 1; j < k; ++j) {
          sum = sum.add(mT.get(n - k, j));
        }
        return sum;
      }
      return n > 0 && n.equals(k) ? Z.ONE : Z.ZERO;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mT.get(mN, mM);
  }
}
