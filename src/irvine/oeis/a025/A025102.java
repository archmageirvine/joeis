package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a018.A018252;

/**
 * A025102.
 * @author Sean A. Irvine
 */
public class A025102 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025102() {
    super(new A018252(), false);
    next();
  }
}
