package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266179 Binary representation of the n-th iteration of the "Rule <code>6"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266179 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266179() {
    super(new long[] {10000, 0}, new long[] {1, 110});
  }
}
