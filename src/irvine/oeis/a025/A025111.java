package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A025111.
 * @author Sean A. Irvine
 */
public class A025111 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025111() {
    super(new SkipSequence(new A000045(), 1), new A008578(), false);
    next();
  }
}
