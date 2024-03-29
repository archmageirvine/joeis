package irvine.oeis.a328;
// Generated by gen_seq4.pl 2023-12-09/convprod at 2023-12-10 21:53

import irvine.oeis.a028.A028930;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A328531 G.f. = Phi^6, where Phi = g.f. for A028930.
 * @author Georg Fischer
 */
public class A328531 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A328531() {
    super(0, "6", new A028930());
  }
}
