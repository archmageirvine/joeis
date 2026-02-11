package irvine.oeis.a381;
// manually 2026-02-10/convprod at 2026-02-10 23:37

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001190;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A381777 Self-convolution of A001190.
 * @author Georg Fischer
 */
public class A381777 extends PrependSequence {

  /** Construct the sequence. */
  public A381777() {
    super(0, new ConvolutionProduct(0, "2", new A001190().skip(1)), 0, 0);
  }
}
