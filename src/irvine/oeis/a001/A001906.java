package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001906 F(2n) = bisection of Fibonacci sequence: a(n) = 3*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A001906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001906() {
    super(new long[] {-1, 3}, new long[] {0, 1});
  }
}
