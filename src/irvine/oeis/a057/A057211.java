package irvine.oeis.a057;
// manually triconst 2021-10-19

import irvine.oeis.PeriodicSequence;
import irvine.oeis.triangle.WrappedConstantTriangle;

/**
 * A057211 Alternating runs of ones and zeros, where the n-th run has length n.
 * @author Georg Fischer
 */
public class A057211 extends WrappedConstantTriangle {

  /** Construct the sequence. */
  public A057211() {
    super(new PeriodicSequence(1, 0));
    mSeqPlus = new PeriodicSequence(1, 0);
  }
}
