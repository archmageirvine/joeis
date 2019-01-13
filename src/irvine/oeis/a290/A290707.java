package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290707.
 * @author Sean A. Irvine
 */
public class A290707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290707() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 4, 11, 24});
  }
}
