package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;

/**
 * A023668 Convolution of <code>A001950</code> and <code>A023533</code>.
 * @author Sean A. Irvine
 */
public class A023668 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023668() {
    super(new A001950(), new SkipSequence(new A023533(), 1));
  }
}
