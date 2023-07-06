package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;

/**
 * A023670 Convolution of A023533 with itself.
 * @author Sean A. Irvine
 */
public class A023670 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023670() {
    super(1, new A023533().skip(1));
  }
}
