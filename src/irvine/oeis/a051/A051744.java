package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051744 a(n) = n*(n+1)*(n^2+5*n+18)/24.
 * @author Sean A. Irvine
 */
public class A051744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051744() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {2, 8, 21, 45, 85});
  }
}
