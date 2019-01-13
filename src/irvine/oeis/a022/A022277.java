package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022277.
 * @author Sean A. Irvine
 */
public class A022277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022277() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 39});
  }
}
