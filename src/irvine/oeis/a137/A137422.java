package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a053.A053120;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A137422 Triangle T(n,k) = A053120(n-1,k) + A053120(n-1,k-1), read by rows.
 * @author Georg Fischer
 */
public class A137422 extends BaseTriangle {

  private BaseTriangle mSeq = new A053120();

  /** Construct the sequence. */
  public A137422() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == 0) ? Z.ZERO : mSeq.triangleElement(n - 1, k).add(mSeq.triangleElement(n - 1, k - 1));
  }
}
