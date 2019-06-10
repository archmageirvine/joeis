package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001950;

/**
 * A023654 Convolution of <code>(F(2), F(3), F(4), ...)</code> and <code>A001950</code>.
 * @author Sean A. Irvine
 */
public class A023654 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023654() {
    super(new A001950(), new SkipSequence(new A000045(), 2));
  }
}
