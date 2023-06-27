package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158773 a(n) = 1600*n^2 - 40.
 * @author Sean A. Irvine
 */
public class A158773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158773() {
    super(1, new long[] {1, -3, 3}, new long[] {1560, 6360, 14360});
  }
}
