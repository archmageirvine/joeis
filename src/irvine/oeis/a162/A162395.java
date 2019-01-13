package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162395.
 * @author Sean A. Irvine
 */
public class A162395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162395() {
    super(new long[] {-1, -3, -3}, new long[] {1, -4, 9});
  }
}
