package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023531;

/**
 * A024891.
 * @author Sean A. Irvine
 */
public class A024891 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024891() {
    super(new A023531(), new A008578(), false);
    next();
  }
}
