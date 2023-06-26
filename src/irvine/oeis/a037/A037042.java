package irvine.oeis.a037;

import irvine.oeis.FiniteSequence;

/**
 * A037042 2-White numbers (take power 2, sum 2-digit groups to get same number).
 * @author Georg Fischer
 */
public class A037042 extends FiniteSequence {

  /** Construct the sequence. */
  public A037042() {
    super(1, FINITE, 0, 1, 45, 55, 99);
  }
}
