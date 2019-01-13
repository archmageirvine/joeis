package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100133.
 * @author Sean A. Irvine
 */
public class A100133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100133() {
    super(new long[] {3, 0, -4, 4}, new long[] {1, 2, 4, 8});
  }
}
