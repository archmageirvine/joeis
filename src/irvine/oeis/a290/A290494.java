package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290494.
 * @author Sean A. Irvine
 */
public class A290494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290494() {
    super(new long[] {1, -1, -1, 1, -1, 0, 2}, new long[] {5, 12, 17, 25, 44, 76, 131});
  }
}
