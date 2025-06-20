package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-10.ack/convprod at 2025-06-10 21:36

import irvine.oeis.transform.ConvolutionProduct;

/**
 * A384578 G.f. A(x) satisfies A(x) = ( 1 + x * A(x*A(x))^(1/4) )^4.
 * @author Georg Fischer
 */
public class A384578 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A384578() {
    super(0, "4", new A384574());
  }
}
