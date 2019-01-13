package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290968.
 * @author Sean A. Irvine
 */
public class A290968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290968() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {1, 1, 1, -1, 1});
  }
}
