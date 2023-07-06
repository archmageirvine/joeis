package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A023561 Convolution of A023531 and (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A023561 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023561() {
    super(1, new A023531().skip(1), new A000045().skip(2));
  }
}
