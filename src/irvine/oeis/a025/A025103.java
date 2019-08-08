package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a018.A018252;

/**
 * A025103.
 * @author Sean A. Irvine
 */
public class A025103 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025103() {
    super(new A018252(), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
