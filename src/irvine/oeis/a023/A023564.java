package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001950;

/**
 * A023564 Convolution of <code>A023531</code> and <code>A001950</code>.
 * @author Sean A. Irvine
 */
public class A023564 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023564() {
    super(new SkipSequence(new A023531(), 1), new A001950());
  }
}
