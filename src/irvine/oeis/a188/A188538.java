package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188538 Row sums of triangle A156070.
 * @author Sean A. Irvine
 */
public class A188538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188538() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 2, 2, 4, 6, 12});
  }
}
