package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037483.
 * @author Sean A. Irvine
 */
public class A037483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037483() {
    super(new long[] {-6, 1, 6}, new long[] {1, 8, 49});
  }
}
