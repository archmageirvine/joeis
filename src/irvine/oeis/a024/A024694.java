package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023533;

/**
 * A024694.
 * @author Sean A. Irvine
 */
public class A024694 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024694() {
    super(new A023533(), new A008578());
  }
}
