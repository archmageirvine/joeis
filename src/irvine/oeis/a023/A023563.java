package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000201;

/**
 * A023563 Convolution of A023531 and A000201.
 * @author Sean A. Irvine
 */
public class A023563 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023563() {
    super(new SkipSequence(new A023531(), 1), new A000201());
  }
}
