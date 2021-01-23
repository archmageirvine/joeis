package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;

/**
 * A023556 Convolution of A023531 and A023532.
 * @author Sean A. Irvine
 */
public class A023556 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023556() {
    super(new SkipSequence(new A023531(), 1), new SkipSequence(new A023532(), 1));
  }
}
