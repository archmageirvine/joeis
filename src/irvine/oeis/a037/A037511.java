package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037511.
 * @author Sean A. Irvine
 */
public class A037511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037511() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 12, 120, 1201});
  }
}
