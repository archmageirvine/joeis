package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A023596 Convolution of <code>A023532</code> and Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A023596 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023596() {
    super(new SkipSequence(new A023532(), 1), new SkipSequence(new A000045(), 1));
  }
}
