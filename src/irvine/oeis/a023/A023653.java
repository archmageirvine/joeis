package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000201;

/**
 * A023653 Convolution of (F(2), F(3), F(4), ...) and A000201.
 * @author Sean A. Irvine
 */
public class A023653 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023653() {
    super(1, new A000201(), new SkipSequence(new A000045(), 2));
  }
}
