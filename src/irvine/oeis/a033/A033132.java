package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033132.
 * @author Sean A. Irvine
 */
public class A033132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033132() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 6, 30, 151});
  }
}
