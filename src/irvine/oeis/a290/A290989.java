package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290989.
 * @author Sean A. Irvine
 */
public class A290989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290989() {
    super(new long[] {-1, 2, -1, -1, 0, 2, 1, -5, 4}, new long[] {1, 4, 11, 26, 55, 109, 208, 389, 722});
  }
}
