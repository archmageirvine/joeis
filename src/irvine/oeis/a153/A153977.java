package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153977 One-fourth of partial sums of A153976.
 * @author Sean A. Irvine
 */
public class A153977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153977() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {2, 9, 27, 65, 135});
  }
}
