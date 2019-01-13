package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100434.
 * @author Sean A. Irvine
 */
public class A100434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100434() {
    super(new long[] {-1, 0, -6, 0}, new long[] {3, 4, -17, -24});
  }
}
