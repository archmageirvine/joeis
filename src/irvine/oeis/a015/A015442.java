package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015442 Generalized Fibonacci numbers: a(n) = a(n-1) + 7*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A015442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015442() {
    super(new long[] {7, 1}, new long[] {0, 1});
  }
}
