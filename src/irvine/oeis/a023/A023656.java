package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A023656 Convolution of (F(2), F(3), F(4), ...) and A014306.
 * @author Sean A. Irvine
 */
public class A023656 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023656() {
    super(1, new A014306().skip(1), new A000045().skip(2));
  }
}
