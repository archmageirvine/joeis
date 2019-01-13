package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100050.
 * @author Sean A. Irvine
 */
public class A100050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100050() {
    super(new long[] {-1, 2, -3, 2}, new long[] {0, 1, 2, 0});
  }
}
