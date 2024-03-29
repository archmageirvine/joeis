package irvine.oeis.a357;
// Generated by gen_seq4.pl robots/convprod at 2023-12-23 19:12

import irvine.oeis.a067.A067595;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A357427 Expansion of Product_{k&gt;=0} 1 / (1 + x^Lucas(k)).
 * @author Georg Fischer
 */
public class A357427 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A357427() {
    super(0, "-1", new A067595());
  }
}
