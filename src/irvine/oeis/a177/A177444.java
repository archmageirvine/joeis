package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A177444 Triangle by columns, (1, 1, 0, 1, 0, 0, 0, ...); shifted down twice for columns &gt; 0.
 * @author Georg Fischer
 */
public class A177444 extends BaseTriangle {

  /** Construct the sequence. */
  public A177444() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    switch (n - 2 * k) {
      case 0:
      case 1:
      case 3:
        return Z.ONE;
      default:
        return Z.ZERO;
    }
  }
}
