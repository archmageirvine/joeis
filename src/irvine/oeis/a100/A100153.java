package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100153.
 * @author Sean A. Irvine
 */
public class A100153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100153() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 60, 276, 748});
  }
}
