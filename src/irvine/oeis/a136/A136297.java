package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136297.
 * @author Sean A. Irvine
 */
public class A136297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136297() {
    super(new long[] {3, -3, 3}, new long[] {1, 3, 1});
  }
}
