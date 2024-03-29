package irvine.oeis.a352;
// Generated by gen_seq4.pl 2023-12-14/convprod at 2023-12-19 19:21

import irvine.oeis.transform.ConvolutionProduct;

/**
 * A352383 G.f. A(x) satisfies: A(x) = (1 + 2*x*A(x)^3)^2 / (1 + x*A(x)^3).
 * @author Georg Fischer
 */
public class A352383 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A352383() {
    super(0, "1/3", new A352384());
  }
}
