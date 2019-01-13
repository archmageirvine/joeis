package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211703.
 * @author Sean A. Irvine
 */
public class A211703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211703() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {1, 3, 5, 8, 9, 12, 13});
  }
}
