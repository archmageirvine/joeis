package irvine.oeis.a014;

import irvine.oeis.ExponentialConvolutionSequence;

/**
 * A014340 Four-fold exponential convolution of Fibonacci numbers with themselves.
 * @author Sean A. Irvine
 */
public class A014340 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A014340() {
    super(new A014334());
  }
}

