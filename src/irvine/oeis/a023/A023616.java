package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;

/**
 * A023616 Self-convolution of A023532.
 * @author Sean A. Irvine
 */
public class A023616 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023616() {
    super(1, new A023532().skip(1));
  }
}
