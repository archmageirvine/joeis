package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293004.
 * @author Sean A. Irvine
 */
public class A293004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293004() {
    super(new long[] {-1, -1, 3}, new long[] {0, 0, 2});
  }
}
