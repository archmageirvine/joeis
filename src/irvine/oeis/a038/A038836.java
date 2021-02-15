package irvine.oeis.a038;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a002.A002802;

/**
 * A038836 Convolution of Catalan numbers {1,2,5,14,...} with A002802 (5-fold convoluted central binomial coefficients).
 * @author Sean A. Irvine
 */
public class A038836 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A038836() {
    super(new SkipSequence(new A000108(), 1), new A002802());
  }
}
