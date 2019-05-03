package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267127 Binary representation of the n-th iteration of the "Rule <code>99"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267127() {
    super(new long[] {100000000000L, 0, -110110000000L, -100000000, 10121010000L, 110110000, -11011000, -10121010, 1000, 11011, 0}, new long[] {1, 100, 1010, 1101001, 1100100, 11101010011L, 1101001000, 111101100100111L, 1101010010000L, 1111101101001001111L, 1101100100100000L});
  }
}
