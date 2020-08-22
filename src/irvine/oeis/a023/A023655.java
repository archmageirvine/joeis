package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A023655 Convolution of (F(2), F(3), F(4), ...) and A023533.
 * @author Sean A. Irvine
 */
public class A023655 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023655() {
    super(new SkipSequence(new A023533(), 1), new SkipSequence(new A000045(), 2));
  }
}
