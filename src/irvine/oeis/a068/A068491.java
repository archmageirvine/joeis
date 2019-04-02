package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068491 Expansion of Molien series for a certain 4-D group of order 96.
 * @author Sean A. Irvine
 */
public class A068491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068491() {
    super(new long[] {-1, 2, -1, 0, 1, -2, 2, -2, 1, 0, -1, 2}, new long[] {1, 1, 2, 3, 6, 8, 13, 17, 25, 31, 42, 52});
  }
}
