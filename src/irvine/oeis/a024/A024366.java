package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023532;

/**
 * A024366.
 * @author Sean A. Irvine
 */
public class A024366 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024366() {
    super(new A023532());
  }
}
