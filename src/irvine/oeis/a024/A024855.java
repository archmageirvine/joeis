package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a023.A023531;

/**
 * A024855.
 * @author Sean A. Irvine
 */
public class A024855 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024855() {
    super(new A001477(), new A023531(), false);
    next();
  }
}
