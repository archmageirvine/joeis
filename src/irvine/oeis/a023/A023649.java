package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A023649 Convolution of composite numbers and (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A023649 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023649() {
    super(1, new A002808(), new A000045().skip(2));
  }
}
