package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a008.A008578;

/**
 * A024867.
 * @author Sean A. Irvine
 */
public class A024867 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024867() {
    super(new A001477(), new A008578(), false);
    next();
  }
}
