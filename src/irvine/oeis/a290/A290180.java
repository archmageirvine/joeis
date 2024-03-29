package irvine.oeis.a290;
// Generated by gen_seq4.pl eisenprod/convprod at 2023-02-23 22:13

import irvine.oeis.a000.A000594;
import irvine.oeis.a008.A008410;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A290180 Coefficients in expansion of E_8*Delta^2 where Delta is the generating function of Ramanujan's tau function (A000594).
 * @author Georg Fischer
 */
public class A290180 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A290180() {
    super(2, "+1,+2", new A008410(), new A000594());
  }
}
