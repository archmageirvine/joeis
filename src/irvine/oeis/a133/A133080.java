package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A133080 Interpolation operator: Triangle with an even number of zeros in each line followed by 1 or 2 ones.
 * @author Georg Fischer
 */
public class A133080 extends BaseTriangle {

  /** Construct the sequence. */
  public A133080() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.ONE : ((k == n - 1) ? (((n & 1) == 0) ? Z.ZERO : Z.ONE) : Z.ZERO);
  }
}
