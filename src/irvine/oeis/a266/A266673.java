package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266673 Binary representation of the n-th iteration of the "Rule <code>57"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266673() {
    super(new long[] {100000000000L, 0, -110110000000L, -100000000, 10121010000L, 110110000, -11011000, -10121010, 1000, 11011, 0}, new long[] {1, 1, 1010, 1001011, 1001100, 11001010111L, 1001011000, 111001001101111L, 1001010110000L, 1111001001011011111L, 1001001101100000L});
  }
}
