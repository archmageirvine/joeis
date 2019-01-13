package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290904.
 * @author Sean A. Irvine
 */
public class A290904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290904() {
    super(new long[] {-1, 4, -4, 4}, new long[] {0, 2, 8, 24});
  }
}
