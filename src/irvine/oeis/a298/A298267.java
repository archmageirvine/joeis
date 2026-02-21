package irvine.oeis.a298;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A298267 a(n) is the maximum number of heptiamonds in a hexagon of order n.
 * @author Georg Fischer
 */
public class A298267 extends GeneratingFunctionSequence {
  // The recurrence is confirmed b.o. the floor() formula.

  /** Construct the sequence. */
  public A298267() {
    super(0, new long[] {0, 3, 1, 2, 2, 1, 3}, new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2, -1});
  }
}
