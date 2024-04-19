package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a053.A053120;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A137448 Triangle T(n,k) = (1-k*(k-1))*A053120(n,k), read by rows, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A137448 extends BaseTriangle {

  private final BaseTriangle mSeq = new A053120();

  /** Construct the sequence. */
  public A137448() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.triangleElement(n, k).multiply(1 - (long) k * (k - 1));
  }
}
