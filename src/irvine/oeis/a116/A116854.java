package irvine.oeis.a116;
// manually robots/diffseq at 2023-08-10

import irvine.math.z.Z;
import irvine.oeis.a068.A068106;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A116854 First differences of the rows in the triangle of A116853, starting with 0.
 * @author Georg Fischer
 */
public class A116854 extends BaseTriangle {

  private A068106 mSeq = new A068106();

  /** Construct the sequence. */
  public A116854() {
    super(1, 1, 1);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 1) ? mSeq.triangleElement(n, k) : mSeq.triangleElement(n - 1, k - 1);
  }
}
