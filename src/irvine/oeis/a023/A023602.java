package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000201;

/**
 * A023602 Convolution of <code>A023532</code> and <code>A000201</code>.
 * @author Sean A. Irvine
 */
public class A023602 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023602() {
    super(new SkipSequence(new A023532(), 1), new A000201());
  }
}
