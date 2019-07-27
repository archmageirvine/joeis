package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a023.A023532;

/**
 * A024856.
 * @author Sean A. Irvine
 */
public class A024856 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024856() {
    super(new A001477(), new A023532(), false);
    next();
  }
}
