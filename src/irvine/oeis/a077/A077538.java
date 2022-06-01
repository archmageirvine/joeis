package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077538 First differences of triangular numbers with square pyramidal indices.
 * @author Sean A. Irvine
 */
public class A077538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077538() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14, 90, 360, 1075, 2646});
  }
}
