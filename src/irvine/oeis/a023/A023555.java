package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;

/**
 * A023555 Self-convolution of A023531.
 * @author Sean A. Irvine
 */
public class A023555 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023555() {
    super(1, new A023531().skip(1));
  }
}
