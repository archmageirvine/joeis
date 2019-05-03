package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266219 Binary representation of the middle column of the "Rule <code>7"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266219() {
    super(new long[] {-10, 1, 10}, new long[] {1, 11, 110});
  }
}
