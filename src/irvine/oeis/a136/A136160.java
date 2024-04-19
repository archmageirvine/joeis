package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.a053.A053120;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A136160 Triangle T(n,k) = k*A053120(n,k).
 * @author Georg Fischer
 */
public class A136160 extends BaseTriangle {

  private final BaseTriangle mSeq = new A053120();

  /** Construct the sequence. */
  public A136160() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.triangleElement(n, k).multiply(k);
  }
}
