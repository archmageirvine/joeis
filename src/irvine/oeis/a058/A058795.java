package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058795 Row 4 of <code>A007754</code>.
 * @author Sean A. Irvine
 */
public class A058795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058795() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {7, 85, 301, 751, 1555});
  }
}
