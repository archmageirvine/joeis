package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100329.
 * @author Sean A. Irvine
 */
public class A100329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100329() {
    super(new long[] {1, -1, -1, -1}, new long[] {0, 1, -1, 0});
  }
}
