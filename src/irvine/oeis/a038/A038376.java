package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038376 a(n) = (n-3)*A006918(n-2)/2 for n &gt;= 2, with a(0) = a(1) = 0.
 * @author Sean A. Irvine
 */
public class A038376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038376() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 0, 1, 5, 12, 28});
  }
}
