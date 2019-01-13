package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022283.
 * @author Sean A. Irvine
 */
public class A022283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022283() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 51});
  }
}
