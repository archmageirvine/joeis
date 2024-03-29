package irvine.oeis.a294;
// Generated by gen_seq4.pl eisenprod/convprod at 2023-02-23 22:13

import irvine.oeis.a004.A004009;
import irvine.oeis.a013.A013973;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A294182 Coefficients in expansion of E_4/E_6.
 * @author Georg Fischer
 */
public class A294182 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A294182() {
    super(0, "+1,-1", new A004009(), new A013973());
  }
}
