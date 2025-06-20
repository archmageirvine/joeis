package irvine.oeis.a110;
// Generated by gen_seq4.pl 2025-06-10.ack/convprod at 2025-06-10 21:36

import irvine.oeis.a000.A000142;
import irvine.oeis.a047.A047053;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A110467 Convolution of 4^n*n! and n!.
 * @author Georg Fischer
 */
public class A110467 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A110467() {
    super(0, "1,1", new A047053(), new A000142());
  }
}
