package irvine.oeis.a071;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a000.A000122;
import irvine.oeis.a004.A004009;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071967 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A071967() {
    super(0, new ZeroSpacedSequence(new A004009(), 1), new A000122());
  }
}
