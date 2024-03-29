package irvine.oeis.a167;
// Generated by gen_seq4.pl 2023-12-14/convprod at 2023-12-19 19:21

import irvine.oeis.a155.A155200;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A167140 Self-convolution of A155200.
 * @author Georg Fischer
 */
public class A167140 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A167140() {
    super(0, "2", new A155200());
  }
}
