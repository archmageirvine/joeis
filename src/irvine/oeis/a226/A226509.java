package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226509.
 * @author Sean A. Irvine
 */
public class A226509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226509() {
    super(new long[] {1, -1, 0, -1, 0, 2}, new long[] {3, 3, 3, 8, 9, 12});
  }
}
