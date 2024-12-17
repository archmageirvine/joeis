package irvine.oeis.a073;

import irvine.oeis.ConvolutionSequence;

/**
 * A073712 Self-convolution of A073711.
 * @author Sean A. Irvine
 */
public class A073712 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A073712() {
    super(0, new A073711());
  }
}
