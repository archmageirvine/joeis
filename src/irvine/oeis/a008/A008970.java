package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008970.
 * @author Sean A. Irvine
 */
public class A008970 extends MemoryFunction2<Integer, Z> implements Sequence {

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
    return get(mRow, mPos++).divide(2);
  }

}


