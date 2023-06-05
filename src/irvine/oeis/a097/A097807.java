package irvine.oeis.a097;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A097807 Riordan array (1/(1+x),1) read by rows.
 * @author Georg Fischer
 */
public class A097807 extends BaseTriangle {

  /** Construct the sequence. */
  public A097807() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (((n - k) & 1) == 0) ? Z.ONE : Z.NEG_ONE;
  }
}
