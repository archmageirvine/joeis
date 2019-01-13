package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033486.
 * @author Sean A. Irvine
 */
public class A033486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033486() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 12, 60, 180, 420});
  }
}
