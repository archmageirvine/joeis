package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A025105.
 * @author Sean A. Irvine
 */
public class A025105 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025105() {
    super(new SkipSequence(new A000045(), 1), false);
    next();
  }
}
