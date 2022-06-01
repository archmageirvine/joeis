package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058794 Row 3 of A007754.
 * @author Sean A. Irvine
 */
public class A058794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058794() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 18, 52, 110});
  }
}
