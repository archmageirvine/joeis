package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100138.
 * @author Sean A. Irvine
 */
public class A100138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100138() {
    super(new long[] {2, 0, 0, 8, -12, 6}, new long[] {1, 2, 4, 8, 16, 32});
  }
}
