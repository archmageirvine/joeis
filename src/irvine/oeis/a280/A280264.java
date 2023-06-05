package irvine.oeis.a280;

import irvine.oeis.a000.A000009;
import irvine.oeis.a279.A279329;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A280264 G.f.: Product_{k&gt;=1} (1+x^k) / (1+x^(k^3)).
 * @author Georg Fischer
 */
public class A280264 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A280264() {
    super(0, "1,-1", new A000009(), new A279329());
  }
}
