package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015445 Generalized Fibonacci numbers: <code>a(n) = a(n-1) + 9*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015445() {
    super(new long[] {9, 1}, new long[] {1, 1});
  }
}
