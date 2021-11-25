package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A173238 Triangle by columns, A000041 in every column shifted down twice for columns &gt; 0.
 * @author Georg Fischer
 */
public class A173238 extends DoubleRowTriangle {

  protected Sequence mSeq = new A000041();

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? mSeq.next() : get(n - 2, k - 1);
  }
}
