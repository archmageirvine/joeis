package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211522.
 * @author Sean A. Irvine
 */
public class A211522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211522() {
    super(new long[] {1, -1, -1, 1, 0, -1, 1, 1}, new long[] {0, 0, 0, 1, 2, 3, 4, 6});
  }
}
