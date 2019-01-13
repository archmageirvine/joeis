package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268410.
 * @author Sean A. Irvine
 */
public class A268410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268410() {
    super(new long[] {1, 1, 1}, new long[] {5, 7, 9});
  }
}
