package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280932 a(n) = 2*F(n-1) + 2*F(n-3) + 10*F(n-5) + 9*F(n-8) where n &gt;= 8 and F = A000045.
 * @author Sean A. Irvine
 */
public class A280932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280932() {
    super(new long[] {1, 1}, new long[] {56, 97});
  }
}
