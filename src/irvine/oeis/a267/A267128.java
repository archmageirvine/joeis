package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267128 Decimal representation of the n-th iteration of the "Rule 99" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267128() {
    super(new long[] {2048, 0, -3456, -256, 1616, 432, -216, -202, 8, 27, 0}, new long[] {1, 4, 10, 105, 100, 1875, 840, 31527, 6800, 514639, 55584});
  }
}
