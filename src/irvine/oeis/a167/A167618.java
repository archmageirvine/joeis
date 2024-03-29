package irvine.oeis.a167;
// Generated by gen_seq4.pl convprod at 2023-02-24 23:06

import irvine.oeis.a010.A010054;
import irvine.oeis.a052.A052343;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A167618 Convolution of A010054 with A052343.
 * @author Georg Fischer
 */
public class A167618 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A167618() {
    super(0, "1,1", new A010054(), new A052343());
  }
}
