package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266668 Decimal representation of the n-th iteration of the "Rule <code>51"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266668() {
    super(new long[] {-32, -16, 34, 17, -2}, new long[] {1, 5, 4, 119, 16});
  }
}
