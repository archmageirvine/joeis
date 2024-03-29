package irvine.oeis.a280;
// Generated by gen_seq4.pl convprod at 2023-02-24 23:06

import irvine.oeis.a000.A000009;
import irvine.oeis.a001.A001156;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A280276 G.f.: Product_{k&gt;=1} (1 + x^k) / (1 - x^(k^2)).
 * @author Georg Fischer
 */
public class A280276 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A280276() {
    super(0, "1,1", new A000009(), new A001156());
  }
}
