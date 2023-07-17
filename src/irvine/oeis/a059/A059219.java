package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059219 Variation of Boustrophedon transform applied to sequence 1,0,0,0,...: fill an array by diagonals in alternating directions - 'up' and 'down'. The first element of each diagonal after the first is 0. When 'going up', add to the previous element the elements of the row the new element is in. When 'going down', add to the previous element the elements of the column the new element is in. The final element of the n-th diagonal is a(n).
 * @author Sean A. Irvine
 */
public class A059219 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059219() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A059219(final int offset) {
    super(offset);
  }

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    if ((n & 1) == 0) {
      if (m == n) {
        return Z.ZERO;
      }
      Z sum = get(n, m + 1);
      for (int row = n - 1; row >= m; --row) {
        sum = sum.add(get(row, m));
      }
      return sum;
    } else {
      if (m == 0) {
        return Z.ZERO;
      }
      Z sum = get(n, m - 1);
      for (int row = n - 1; row >= 0 && m >= n - row; --row) {
        sum = sum.add(get(row, m - (n - row)));
      }
      return sum;
    }
  }

  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 0 ? get(mN, 0) : get(mN, mN);
  }
}
