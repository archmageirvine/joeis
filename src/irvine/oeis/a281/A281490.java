package irvine.oeis.a281;
// Generated by gen_seq4.pl convprod at 2023-02-24 23:06

import irvine.oeis.a010.A010054;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A281490 Expansion of f(x, x^3) * f(x, x^8) in powers of x where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A281490 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A281490() {
    super(0, "1,1", new A010054(), new A281814());
  }
}
