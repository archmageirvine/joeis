package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100284.
 * @author Sean A. Irvine
 */
public class A100284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100284() {
    super(new long[] {-5, 1, 5}, new long[] {1, 1, 5});
  }
}
