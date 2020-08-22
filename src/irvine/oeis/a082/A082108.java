package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082108 a(n) = 4n^2 + 6n + 1.
 * @author Sean A. Irvine
 */
public class A082108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082108() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 29});
  }
}
