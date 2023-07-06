package irvine.oeis.a305;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;
import irvine.oeis.a006.A006128;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A305119 G.f.: Sum_{k&gt;=1} x^k/(1-x^k) * Product_{k&gt;=1} 1/(1-x^k)^2.
 * @author Georg Fischer
 */
public class A305119 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A305119() {
    super(0, "1,1", new A006128().skip(1), new A000041());
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next();
  }
}
