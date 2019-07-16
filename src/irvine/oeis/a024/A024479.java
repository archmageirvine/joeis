package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;

/**
 * A024479.
 * @author Sean A. Irvine
 */
public class A024479 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024479() {
    super(new PrependSequence(new A008578(), 0));
  }
}
