package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.a059.A059384;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A239633 Triangle read by rows: T(n,k) = A059384(n)/(A059384(k)*A059384(n-k)).
 * @author Georg Fischer
 */
public class A239633 extends BaseTriangle {

  private final A059384 mSeq = new A059384();

  /** Construct the sequence. */
  public A239633() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 0 || k == n) ? Z.ONE : mSeq.a(n).divide(mSeq.a(k).multiply(mSeq.a(n - k)));
  }
}
