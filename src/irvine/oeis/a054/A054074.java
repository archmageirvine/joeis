package irvine.oeis.a054;

import irvine.oeis.PositionSequence;

/**
 * A054074 Position of n-th 1 in A054073.
 * @author Sean A. Irvine
 */
public class A054074 extends PositionSequence {

  /** Construct the sequence. */
  public A054074() {
    super(1, new A054073(), 1);
  }
}
