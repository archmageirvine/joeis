package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A008971 Triangle read by rows: T(n,k) is the number of permutations of [n] with k increasing runs of length at least 2.
 * @author Sean A. Irvine
 */
public class A008971 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A008971() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008971(final int offset) {
    super(offset);
  }

  private int mRow = -1;
  private int mPos = 2;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    final Z w;
    if (k < 0 || k >= 1 + n / 2) {
      w = Z.ZERO;
    } else if (n == 0) {
      w = Z.ONE;
    } else {
      w = get(n - 1, k).multiply(2L * k + 1).add(get(n - 1, k - 1).multiply(n - 2L * k + 1));
    }
    return w;
  }

  @Override
  public Z next() {
    if (mPos >= 1 + mRow / 2) {
      ++mRow;
      mPos = 0;
    }
    return get(mRow, mPos++);
  }

}

