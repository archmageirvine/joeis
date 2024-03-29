package irvine.oeis.a119;
// Generated by gen_seq4.pl convprod at 2023-02-24 23:06

import irvine.oeis.transform.ConvolutionProduct;

/**
 * A119376 Second diagonal above the central terms of pendular trinomial triangle A119369, ignoring leading zeros.
 * @author Georg Fischer
 */
public class A119376 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A119376() {
    super(0, "1,1", new A119370(), new A119375());
  }
}
