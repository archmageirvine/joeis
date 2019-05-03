package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280932 <code>a(n) = 2*F(n-1) + 2*F(n-3) + 10*F(n-5) + 9*F(n-8)</code> where <code>n &gt;= 8</code> and F <code>= A000045</code>.
 * @author Sean A. Irvine
 */
public class A280932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280932() {
    super(new long[] {1, 1}, new long[] {56, 97});
  }
}
