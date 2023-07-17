package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A008970 Triangle T(n,k) = P(n,k)/2, n &gt;= 2, 1 &lt;= k &lt; n, of one-half of number of permutations of 1..n such that the differences have k runs with the same signs.
 * @author Sean A. Irvine
 */
public class A008970 extends MemoryFunction2Sequence<Integer, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008970(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008970() {
    super(2);
  }

  private int mRow = 0;
  private int mPos = 2;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k <= 0 || k > n) {
      return Z.ZERO;
    } else if (k == 1) {
      return Z.TWO;
    } else {
      return get(n - 1, k).multiply(k).add(get(n - 1, k - 1).multiply2()).add(get(n - 1, k - 2).multiply(n - k + 1));
    }
  }

  @Override
  public Z next() {
    if (mPos > mRow) {
      ++mRow;
      mPos = 1;
    }
    return get(mRow, mPos++).divide2();
  }

}

