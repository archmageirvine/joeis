package irvine.oeis.a014;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A014336 Three-fold exponential convolution of Fibonacci numbers with themselves.
 * @author Sean A. Irvine
 */
public class A014336 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A014336() {
    super(new A000045(), new A014334());
  }
}

