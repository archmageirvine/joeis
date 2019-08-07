package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A025082.
 * @author Sean A. Irvine
 */
public class A025082 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025082() {
    super(new A000045(), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
