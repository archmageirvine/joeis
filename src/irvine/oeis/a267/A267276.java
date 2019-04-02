package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267276 Decimal representation of the n-th iteration of the "Rule 118" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267276() {
    super(new long[] {2048, -2048, 0, -256, 248, 8, 0, 1}, new long[] {1, 7, 19, 123, 283, 1883, 5083, 30939});
  }
}
