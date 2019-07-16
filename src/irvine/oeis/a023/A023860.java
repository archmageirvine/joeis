package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001477;

/**
 * A023860.
 * @author Sean A. Irvine
 */
public class A023860 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023860() {
    super(new A001477(), new A000045());
  }
}
