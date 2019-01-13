package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244865.
 * @author Sean A. Irvine
 */
public class A244865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244865() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {1, 14, 85, 336, 1023, 2610, 5860, 11942});
  }
}
