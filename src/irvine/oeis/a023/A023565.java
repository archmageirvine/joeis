package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;

/**
 * A023565 Convolution of A023531 and A023533.
 * @author Sean A. Irvine
 */
public class A023565 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023565() {
    super(new SkipSequence(new A023531(), 1), new SkipSequence(new A023533(), 1));
  }
}
