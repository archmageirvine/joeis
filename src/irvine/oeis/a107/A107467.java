package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107467.
 * @author Sean A. Irvine
 */
public class A107467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107467() {
    super(new long[] {-1, -1, 2, 1, -3, 1, 3}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
