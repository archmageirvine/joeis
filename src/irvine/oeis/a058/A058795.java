package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058795 Row 4 of A007754.
 * @author Sean A. Irvine
 */
public class A058795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058795() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {7, 85, 301, 751, 1555});
  }
}
