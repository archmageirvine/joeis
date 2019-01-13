package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220889.
 * @author Sean A. Irvine
 */
public class A220889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220889() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {0, 0, 0, 0, 1, 8, 35});
  }
}
