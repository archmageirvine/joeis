package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162484.
 * @author Sean A. Irvine
 */
public class A162484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162484() {
    super(new long[] {-1, -2, 2, 2}, new long[] {2, 8, 14, 36});
  }
}
