package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266809 Binary representation of the n-th iteration of the "Rule <code>62"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266809() {
    super(new long[] {100000, -1000, 0, -100, -99999, 1000, 0, 100}, new long[] {1, 111, 11001, 1101111, 110110001, 11011010111L, 1101101111001L, 110110110001111L});
  }
}
