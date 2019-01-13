package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168297.
 * @author Sean A. Irvine
 */
public class A168297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168297() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1, 9, 31});
  }
}
