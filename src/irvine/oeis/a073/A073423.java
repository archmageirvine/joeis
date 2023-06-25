package irvine.oeis.a073;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A073423 Sums of two powers of zero: triangle read by rows: T(m,n) = 0^n + 0^m, n &gt;= 0, m = 0..n.
 * @author Georg Fischer
 */
public class A073423 extends BaseTriangle {

  /** Construct the sequence. */
  public A073423() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 0) ? (n == 0 ? Z.TWO : Z.ONE) : Z.ZERO;
  }
}

