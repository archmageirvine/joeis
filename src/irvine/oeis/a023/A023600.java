package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A023600 Convolution of A023532 and (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A023600 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023600() {
    super(1, new A023532().skip(1), new A000045().skip(2));
  }
}
