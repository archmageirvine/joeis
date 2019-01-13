package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022410.
 * @author Sean A. Irvine
 */
public class A022410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022410() {
    super(new long[] {-1, 0, 2}, new long[] {3, 11, 15});
  }
}
