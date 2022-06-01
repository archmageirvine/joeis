package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082667 a(n) = floor(2n/3) * ceiling(2n/3) / 2.
 * @author Sean A. Irvine
 */
public class A082667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082667() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 1, 2, 3, 6, 8, 10});
  }
}
