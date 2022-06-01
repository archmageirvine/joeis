package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049675 a(n) = (2*F(3*n) - F(n))/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049675() {
    super(new long[] {-1, -5, -2, 5}, new long[] {0, 1, 5, 22});
  }
}
