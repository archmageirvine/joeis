package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266515 Binary representation of the n-th iteration of the "Rule 29" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266515() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 11, 100, 1101111, 10000, 11110111111L});
  }
}
