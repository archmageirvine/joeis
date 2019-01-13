package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022282.
 * @author Sean A. Irvine
 */
public class A022282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022282() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 49});
  }
}
