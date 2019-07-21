package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;

/**
 * A024316.
 * @author Sean A. Irvine
 */
public class A024316 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024316() {
    super(new A023531());
  }
}
