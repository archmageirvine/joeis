package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023532;
import irvine.oeis.a023.A023533;

/**
 * A025075.
 * @author Sean A. Irvine
 */
public class A025075 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025075() {
    super(new A023532(), new A023533(), false);
    next();
  }
}
