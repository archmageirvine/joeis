package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;

/**
 * A023556 Convolution of A023531 and A023532.
 * @author Sean A. Irvine
 */
public class A023556 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023556() {
    super(1, new A023531().skip(1), new A023532().skip(1));
  }
}
