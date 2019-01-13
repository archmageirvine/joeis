package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012814.
 * @author Sean A. Irvine
 */
public class A012814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012814() {
    super(new long[] {1, -4, 5}, new long[] {0, 1, 5});
  }
}
