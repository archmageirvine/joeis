package irvine.oeis.a153;
// Generated by gen_seq4.pl 2023-11-01/convprod at 2023-11-01 21:06

import irvine.oeis.a000.A000027;
import irvine.oeis.a024.A024581;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A153582 A024581 / [1,2,3,...].
 * @author Georg Fischer
 */
public class A153582 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A153582() {
    super(0, "1,-1", new A024581(), new A000027());
  }
}
