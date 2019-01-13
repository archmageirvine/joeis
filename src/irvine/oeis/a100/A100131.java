package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100131.
 * @author Sean A. Irvine
 */
public class A100131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100131() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 2, 4, 8});
  }
}
