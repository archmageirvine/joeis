package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270889.
 * @author Sean A. Irvine
 */
public class A270889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270889() {
    super(new long[] {1, -7, 7}, new long[] {3, 6, 27});
  }
}
