package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;

/**
 * A023603 Convolution of <code>A023532</code> and <code>A001950</code>.
 * @author Sean A. Irvine
 */
public class A023603 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023603() {
    super(new SkipSequence(new A023532(), 1), new A001950());
  }
}
