package irvine.oeis.a152;
// Generated by gen_seq4.pl convprom/convprod at 2023-07-10 14:24

import irvine.oeis.a084.A084938;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A152039 Convolution of A084938 with itself.
 * @author Georg Fischer
 */
public class A152039 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A152039() {
    super(0, "1, 1", new A084938(), new A084938());
  }
}
