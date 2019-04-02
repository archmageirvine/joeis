package irvine.oeis.a014;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.a000.A000040;

/**
 * A014347 Three-fold exponential convolution of primes with themselves.
 * @author Sean A. Irvine
 */
public class A014347 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A014347() {
    super(new A000040(), new A014345());
  }
}

