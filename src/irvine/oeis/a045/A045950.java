package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045950.
 * @author Sean A. Irvine
 */
public class A045950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045950() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 59, 177});
  }
}
