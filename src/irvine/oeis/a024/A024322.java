package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023531;

/**
 * A024322.
 * @author Sean A. Irvine
 */
public class A024322 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024322() {
    super(new A023531(), new SkipSequence(new A000045(), 1));
  }
}
