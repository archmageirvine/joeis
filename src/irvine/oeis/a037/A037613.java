package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037613.
 * @author Sean A. Irvine
 */
public class A037613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037613() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 9, 56, 337});
  }
}
