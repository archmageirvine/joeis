package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;

/**
 * A023668 Convolution of A001950 and A023533.
 * @author Sean A. Irvine
 */
public class A023668 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023668() {
    super(1, new A001950(), new SkipSequence(new A023533(), 1));
  }
}
