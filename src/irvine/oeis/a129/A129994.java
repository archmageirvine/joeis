package irvine.oeis.a129;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A129994 Triangle read by rows: 2*A007318 - I.
 * @author Georg Fischer
 */
public class A129994 extends BaseTriangle {

  /** Construct the sequence. */
  public A129994() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.ONE : Binomial.binomial(n, k).multiply2();
  }
}
