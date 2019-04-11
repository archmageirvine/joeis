package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249864 A special solution of X(n)^2 - 120*Y(n)^2 <code>= 7^(2*n), n &gt;= 0.</code> The present sequence gives the X values.
 * @author Sean A. Irvine
 */
public class A249864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249864() {
    super(new long[] {-49, 26}, new long[] {1, 13});
  }
}
