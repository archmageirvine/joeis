package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266284 Decimal representation of the n-th iteration of the "Rule <code>13"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266284 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266284() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 2, 5, 106, 21, 1962});
  }
}
