package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022310.
 * @author Sean A. Irvine
 */
public class A022310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022310() {
    super(new long[] {-1, 0, 2}, new long[] {0, 5, 6});
  }
}
