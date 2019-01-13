package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143335.
 * @author Sean A. Irvine
 */
public class A143335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143335() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 1, 0, -1}, new long[] {1, -1, 1, -2, 1, -2, 0, -1, -3, 2});
  }
}
