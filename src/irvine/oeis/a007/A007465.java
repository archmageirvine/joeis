package irvine.oeis.a007;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000217;

/**
 * A007465 Exponential-convolution of triangular numbers with themselves.
 * @author Sean A. Irvine
 */
public class A007465 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A007465() {
    super(new SkipSequence(new A000217(), 1));
  }
}
