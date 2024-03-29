package irvine.oeis.a288;
// Generated by gen_seq4.pl eisenprod/convprod at 2023-02-23 22:13

import irvine.oeis.a004.A004009;
import irvine.oeis.a013.A013973;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A288261 Coefficients in expansion of E_6/E_4.
 * @author Georg Fischer
 */
public class A288261 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A288261() {
    super(0, "+1,-1", new A013973(), new A004009());
  }
}
