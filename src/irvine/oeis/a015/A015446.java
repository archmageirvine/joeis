package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015446 Generalized Fibonacci numbers: <code>a(n) = a(n-1) + 10*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015446() {
    super(new long[] {10, 1}, new long[] {1, 1});
  }
}
