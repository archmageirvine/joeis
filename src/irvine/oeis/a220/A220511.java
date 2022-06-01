package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220511 n^5 + 5n + 5^n.
 * @author Sean A. Irvine
 */
public class A220511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220511() {
    super(new long[] {5, -31, 81, -115, 95, -45, 11}, new long[] {1, 11, 67, 383, 1669, 6275, 23431});
  }
}
