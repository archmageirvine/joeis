package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265722 Number of ON (black) cells in the n-th iteration of the "Rule <code>1"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265722() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 1, 4});
  }
}
