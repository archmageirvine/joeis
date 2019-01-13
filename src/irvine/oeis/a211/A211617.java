package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211617.
 * @author Sean A. Irvine
 */
public class A211617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211617() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 30, 101, 244});
  }
}
