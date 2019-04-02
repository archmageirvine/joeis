package irvine.oeis.a014;

import irvine.oeis.ExponentialConvolutionSequence;

/**
 * A014352 Four-fold exponential convolution of primes with themselves.
 * @author Sean A. Irvine
 */
public class A014352 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A014352() {
    super(new A014345());
  }
}

