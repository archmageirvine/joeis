package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A059317 Pascal&apos;s &quot;rhombus&quot; (actually a triangle T(n,k), n &gt;= 0, 0&lt;=k&lt;=2n) read by rows: each entry is sum of 3 terms above it in previous row and one term above it two rows back.
 * @author Georg Fischer
 */
public class A059317 extends Triangle {

  /**
   * Increases the row index, adds a new, empty row and resets the column index.
   */
  @Override
  protected void addRow() {
    super.addRow();
    if (mRow >= 1) { // skip odd rows
      super.addRow();
    }
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if ((n & 1) == 1) { // odd row
      return Z.ZERO;
    } else {
      return get(n - 2, k - 2).add(get(n - 2, k - 1)).add(get(n - 2, k)).add(get(n - 4, k - 2));
    }
  }
}
