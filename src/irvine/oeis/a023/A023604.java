package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;

/**
 * A023604 Convolution of A023532 and A023533.
 * @author Sean A. Irvine
 */
public class A023604 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023604() {
    super(1, new A023532().skip(1), new A023533().skip(1));
  }
}
