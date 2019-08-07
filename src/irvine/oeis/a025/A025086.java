package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023533;

/**
 * A025086.
 * @author Sean A. Irvine
 */
public class A025086 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025086() {
    super(new A000045(), new A023533(), false);
    next();
  }
}
