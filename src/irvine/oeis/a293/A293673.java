package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293673.
 * @author Sean A. Irvine
 */
public class A293673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293673() {
    super(new long[] {1, 1, -2, -1, 2, 1, -2, -1, 2, 1}, new long[] {0, 1, 1, 2, 2, 4, 6, 10, 17, 27});
  }
}
