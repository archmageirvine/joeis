package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A025101.
 * @author Sean A. Irvine
 */
public class A025101 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025101() {
    super(new PrependSequence(new A008578(), 0), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
