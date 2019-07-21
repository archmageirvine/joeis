package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;

/**
 * A024697.
 * @author Sean A. Irvine
 */
public class A024697 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024697() {
    super(new A008578());
  }
}
