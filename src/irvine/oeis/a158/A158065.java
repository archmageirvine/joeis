package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158065 a(n) = 36*n + 1.
 * @author Sean A. Irvine
 */
public class A158065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158065() {
    super(1, new long[] {-1, 2}, new long[] {37, 73});
  }
}
