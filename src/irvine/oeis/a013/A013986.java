package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013986.
 * @author Sean A. Irvine
 */
public class A013986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013986() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3, 5, 8, 13});
  }
}
