package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162257.
 * @author Sean A. Irvine
 */
public class A162257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162257() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, 7, 33, 82});
  }
}
