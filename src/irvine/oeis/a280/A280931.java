package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280931 a(n) = 2*F(n-1) + 9*F(n-4) + 9*F(n-7) where n &gt;= 7 and F = A000045.
 * @author Sean A. Irvine
 */
public class A280931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280931() {
    super(7, new long[] {1, 1}, new long[] {34, 62});
  }
}
