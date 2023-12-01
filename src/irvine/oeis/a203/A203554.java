package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A203554 Lodumo_2 of A079813, which is n 0's followed by n 1's..
 * @author Georg Fischer
 */
public class A203554 extends BaseTriangle {

  /** Construct the sequence. */
  public A203554() {
    super(0, 0, 0, n -> n / 2 + 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    final int n2 = n / 2;
    return Z.valueOf(n2 * (n2 + 1) + (((n & 1) == 0) ? 0 : 1) + 2 * k);
  }
}
