package irvine.oeis.a054;

import irvine.oeis.FilterPositionSequence;

/**
 * A054729 Numbers n such that genus of modular curve X_0(N) is never equal to n.
 * @author Sean A. Irvine
 */
public class A054729 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054729() {
    super(0, new A054728(), 0);
  }
}
