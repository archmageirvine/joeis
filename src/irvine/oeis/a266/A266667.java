package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266667 Binary representation of the n-th iteration of the "Rule <code>51"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266667 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266667() {
    super(new long[] {-100000, -10000, 100010, 10001, -10}, new long[] {1, 101, 100, 1110111, 10000});
  }
}
