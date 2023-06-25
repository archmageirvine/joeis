package irvine.oeis.a073;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A073424 Triangle read by rows: T(m,n) = parity of 0^n + 0^m, n = 0,1,2,3 ..., m = 0,1,2,3, ... n.
 * @author Georg Fischer
 */
public class A073424 extends BaseTriangle {

  /** Construct the sequence. */
  public A073424() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 0) ? (n == 0 ? Z.ZERO : Z.ONE) : Z.ZERO;
  }
}

