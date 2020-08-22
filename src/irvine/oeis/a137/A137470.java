package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137470 Inverse binomial transform of 1, 2, 2, 4, 10, 20, ... = A100088.
 * @author Sean A. Irvine
 */
public class A137470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137470() {
    super(new long[] {2, 0, -1}, new long[] {1, 1, -1});
  }
}
