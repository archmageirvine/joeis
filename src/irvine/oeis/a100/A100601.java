package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100601.
 * @author Sean A. Irvine
 */
public class A100601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100601() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {9, 1001, 50, 333, 1001, 100, 333, 11, 5});
  }
}
