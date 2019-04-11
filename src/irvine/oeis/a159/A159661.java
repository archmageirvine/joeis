package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159661 The general form of the recurrences are the <code>a(j, b(j)</code> and <code>n(j)</code> solutions of the 2 equations problem: <code>11*n(j)+1=a(j)*a(j)</code> and <code>13*n(j)+1=b(j)*b(j)</code> with positive integer elements. the solutions of the 2 equations problem: <code>11*n(j)+1=a(j)*a(j)</code>; <code>13*n(j)+1=b(j)*b(j)</code>; with integer numbers.
 * @author Sean A. Irvine
 */
public class A159661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159661() {
    super(new long[] {-1, 24}, new long[] {1, 25});
  }
}
