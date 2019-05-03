package irvine.oeis.a000;

import irvine.oeis.ConvolutionSequence;

/**
 * A000385 Convolution of <code>A000203</code> with itself.
 * @author Sean A. Irvine
 */
public class A000385 extends ConvolutionSequence {

  /** Default constructor. */
  public A000385() {
    super(new A000203());
  }
}
