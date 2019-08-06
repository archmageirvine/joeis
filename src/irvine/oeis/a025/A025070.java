package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a018.A018252;
import irvine.oeis.a023.A023532;

/**
 * A025070.
 * @author Sean A. Irvine
 */
public class A025070 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025070() {
    super(new A023532(), new A018252(), false);
    next();
  }
}
