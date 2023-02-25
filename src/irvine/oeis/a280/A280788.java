package irvine.oeis.a280;
// manually convprod at 2023-02-24 17:45

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.a027.A027852;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A280788 Convolution of A000081 and A027852, shifted by 3 leading zeros.
 * @author Georg Fischer
 */
public class A280788 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A280788() {
    super(0, "1,1", new SkipSequence(new A000081(), 1), new SkipSequence(new A027852(), 1));
  }
}
