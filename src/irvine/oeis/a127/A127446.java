package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A127446 Triangle T(n,k) = n*A051731(n,k) read by rows.
 * @author Georg Fischer
 */
public class A127446 extends BaseTriangle {

  /** Construct the sequence. */
  public A127446() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n % k == 0) ? Z.valueOf(n) : Z.ZERO;
  }
}
