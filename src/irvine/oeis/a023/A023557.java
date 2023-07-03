package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A023557 Convolution of A023531 and Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A023557 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023557() {
    super(1, new SkipSequence(new A023531(), 1), new SkipSequence(new A000045(), 1));
  }
}
