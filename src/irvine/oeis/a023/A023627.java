package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a008.A008578;

/**
 * A023627 Convolution of <code>(1, p(1), p(2), ...)</code> and composite numbers.
 * @author Sean A. Irvine
 */
public class A023627 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023627() {
    super(new A008578(), new A002808());
  }
}
