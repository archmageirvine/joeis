package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290996.
 * @author Sean A. Irvine
 */
public class A290996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290996() {
    super(new long[] {-1, 7, -9, 5}, new long[] {1, 2, 4, 9});
  }
}
