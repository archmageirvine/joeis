package irvine.oeis.a000;

import irvine.oeis.ConvolutionSequence;

/**
 * A000385 Convolution of A000203 with itself.
 * @author Sean A. Irvine
 */
public class A000385 extends ConvolutionSequence {

  /** Default constructor. */
  public A000385() {
    super(1, new A000203());
  }
}
