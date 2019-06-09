package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;

/**
 * A023616 Self-convolution of <code>A023532</code>.
 * @author Sean A. Irvine
 */
public class A023616 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023616() {
    super(new SkipSequence(new A023532(), 1));
  }
}
