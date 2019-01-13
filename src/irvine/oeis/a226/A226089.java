package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226089.
 * @author Sean A. Irvine
 */
public class A226089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226089() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {2, 7, 11, 8, 11, 29, 37, 23, 28});
  }
}
