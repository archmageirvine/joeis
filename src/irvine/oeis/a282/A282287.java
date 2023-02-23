package irvine.oeis.a282;

import irvine.oeis.a004.A004009;
import irvine.oeis.a013.A013973;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A282287 Coefficients in q-expansion of E_4*E_6^2, where E_4 and E_6 are respectively the Eisenstein series A004009 and A013973.
 * @author Georg Fischer
 */
public class A282287 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A282287() {
    super(0, "1, 2", new A004009(), new A013973());
  }
}
