package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022268.
 * @author Sean A. Irvine
 */
public class A022268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022268() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 21});
  }
}
