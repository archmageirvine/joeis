package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023533;

/**
 * A025109.
 * @author Sean A. Irvine
 */
public class A025109 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025109() {
    super(new SkipSequence(new A000045(), 1), new A023533(), false);
    next();
  }
}
