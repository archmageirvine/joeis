package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A155076 Triangle read by rows. The main diagonal is positive. If rowindex &gt;= 2*columnindex then -1 else 0.
 * @author Georg Fischer
 */
public class A155076 extends BaseTriangle {

  /** Construct the sequence. */
  public A155076() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.ONE : ((n >= 2 * k) ? Z.NEG_ONE : Z.ZERO);
  }
}
