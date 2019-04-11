package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249862 A special solution of X(n)^2 - 280*Y(n)^2 <code>= 3^(2*n), n &gt;= 0</code>; here the X member.
 * @author Sean A. Irvine
 */
public class A249862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249862() {
    super(new long[] {-9, 34}, new long[] {1, 17});
  }
}
