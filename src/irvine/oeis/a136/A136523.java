package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.a053.A053120;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A136523 Triangle T(n,k) = A053120(n,k)+A053120(n-1,k).
 * @author Georg Fischer
 */
public class A136523 extends BaseTriangle {

  private BaseTriangle mSeq = new A053120();

  /** Construct the sequence. */
  public A136523() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.triangleElement(n, k).add((n == 0) ? Z.ZERO : mSeq.triangleElement(n - 1, k));
  }
}
