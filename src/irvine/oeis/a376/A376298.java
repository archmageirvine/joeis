package irvine.oeis.a376;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a053.A053696;

/**
 * A376298 Numbers which are the sum of at least three successive terms of a geometric progression.
 * @author Sean A. Irvine
 */
public class A376298 extends TwoParameterFormSequence {

  private static final DirectSequence SEQ = DirectSequence.create(new A053696());

  /** Construct the sequence. */
  public A376298() {
    super(1, 1, 1, (m, k) -> SEQ.a(k).multiply(m));
  }
}
