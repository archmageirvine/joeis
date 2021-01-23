package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A023561 Convolution of A023531 and (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A023561 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023561() {
    super(new SkipSequence(new A023531(), 1), new SkipSequence(new A000045(), 2));
  }
}
