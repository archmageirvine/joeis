package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027693 a(n) = n^2 + n + 8.
 * @author Sean A. Irvine
 */
public class A027693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027693() {
    super(new long[] {1, -3, 3}, new long[] {8, 10, 14});
  }
}
