package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290992.
 * @author Sean A. Irvine
 */
public class A290992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290992() {
    super(new long[] {1, 0, 1, -2, 0, 4, -6, 4}, new long[] {0, 0, 0, 1, 2, 3, 4, 7});
  }
}
