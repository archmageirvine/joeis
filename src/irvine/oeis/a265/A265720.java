package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265720 Binary representation of the n-th iteration of the "Rule <code>1"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265720() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 0, 100, 1100011, 10000, 11110001111L});
  }
}
