package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100188.
 * @author Sean A. Irvine
 */
public class A100188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100188() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 27, 84, 205});
  }
}
