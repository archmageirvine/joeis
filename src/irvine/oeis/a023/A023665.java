package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000201;

/**
 * A023665 Convolution of A000201 and A023533.
 * @author Sean A. Irvine
 */
public class A023665 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023665() {
    super(1, new A000201(), new SkipSequence(new A023533(), 1));
  }
}
