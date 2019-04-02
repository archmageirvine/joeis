package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019481 a(n) = 3*a(n-1) + a(n-2) - 2*a(n-3) (agrees with A019480 for n &lt;= 19 only).
 * @author Sean A. Irvine
 */
public class A019481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019481() {
    super(new long[] {-2, 1, 3}, new long[] {4, 12, 37});
  }
}
