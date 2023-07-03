package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A023600 Convolution of A023532 and (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A023600 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023600() {
    super(1, new SkipSequence(new A023532(), 1), new SkipSequence(new A000045(), 2));
  }
}
