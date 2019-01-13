package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136391.
 * @author Sean A. Irvine
 */
public class A136391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136391() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 1, 4, 6});
  }
}
