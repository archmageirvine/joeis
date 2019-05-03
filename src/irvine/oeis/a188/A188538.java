package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188538 Row sums of triangle <code>A156070</code>.
 * @author Sean A. Irvine
 */
public class A188538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188538() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 2, 2, 4, 6, 12});
  }
}
