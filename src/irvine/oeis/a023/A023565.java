package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;

/**
 * A023565 Convolution of A023531 and A023533.
 * @author Sean A. Irvine
 */
public class A023565 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023565() {
    super(1, new A023531().skip(1), new A023533().skip(1));
  }
}
