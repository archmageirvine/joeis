package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;

/**
 * A023564 Convolution of A023531 and A001950.
 * @author Sean A. Irvine
 */
public class A023564 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023564() {
    super(1, new SkipSequence(new A023531(), 1), new A001950());
  }
}
