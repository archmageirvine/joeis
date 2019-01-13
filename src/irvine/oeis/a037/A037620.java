package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037620.
 * @author Sean A. Irvine
 */
public class A037620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037620() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 12, 75, 452});
  }
}
