package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;

/**
 * A023603 Convolution of A023532 and A001950.
 * @author Sean A. Irvine
 */
public class A023603 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023603() {
    super(1, new SkipSequence(new A023532(), 1), new A001950());
  }
}
