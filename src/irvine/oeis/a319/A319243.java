package irvine.oeis.a319;

import irvine.oeis.a001.A001156;
import irvine.oeis.a033.A033461;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A319243 Expansion of Product_{k&gt;0} (1 - x^(k^2))/(1 + x^(k^2)).
 * @author Georg Fischer
 */
public class A319243 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A319243() {
    super(0, "-1,-1", new A033461(), new A001156());
  }
}
