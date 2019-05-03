package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266175 Binary representation of the n-th iteration of the "Rule <code>5"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266175() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 10, 100, 1101011, 10000, 11110101111L});
  }
}
