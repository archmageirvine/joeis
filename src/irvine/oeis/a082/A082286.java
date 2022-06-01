package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082286 a(n) = 18*n + 10.
 * @author Sean A. Irvine
 */
public class A082286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082286() {
    super(new long[] {-1, 2}, new long[] {10, 28});
  }
}
