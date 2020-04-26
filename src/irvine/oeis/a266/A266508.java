package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266508 Binary representation of the n-th iteration of the "Rule <code>28"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266508 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266508() {
    super(new long[] {-10, 1, 10}, new long[] {1, 11, 101});
  }
}
