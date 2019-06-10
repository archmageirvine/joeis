package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A023656 Convolution of <code>(F(2), F(3), F(4), ...)</code> and <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023656 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023656() {
    super(new SkipSequence(new A014306(), 1), new SkipSequence(new A000045(), 2));
  }
}
