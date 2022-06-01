package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082115 Fibonacci sequence (mod 3).
 * @author Sean A. Irvine
 */
public class A082115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082115() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 2, 0, 2, 2, 1});
  }
}
