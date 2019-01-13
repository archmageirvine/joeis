package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137402.
 * @author Sean A. Irvine
 */
public class A137402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137402() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {1, 1, 2, 3, 5});
  }
}
