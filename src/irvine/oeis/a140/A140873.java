package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.a060.A060821;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A140873 Triangle T(n, k) = H(n, k+1) - 2*H(n, k) - H(n, k-1), where H(n, k) = A060821(n+3, k), read by rows.
 * @author Georg Fischer
 */
public class A140873 extends BaseTriangle {

  private BaseTriangle mSeq = new A060821();

  /** Construct the sequence. */
  public A140873() {
    super(1, 1, 1);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.triangleElement(n + 3, k + 1).subtract(mSeq.triangleElement(n + 3, k).multiply2()).subtract(mSeq.triangleElement(n + 3, k - 1));
  }
}
