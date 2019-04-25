package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280931 <code>a(n) = 2*F(n-1) + 9*F(n-4) + 9*F(n-7)</code> where <code>n &gt;= 7</code> and F = A000045.
 * @author Sean A. Irvine
 */
public class A280931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280931() {
    super(new long[] {1, 1}, new long[] {34, 62});
  }
}
