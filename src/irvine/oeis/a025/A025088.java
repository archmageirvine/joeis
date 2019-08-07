package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A025088.
 * @author Sean A. Irvine
 */
public class A025088 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025088() {
    super(new A000045(), new A008578(), false);
    next();
  }
}
