package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020536 a(n) = 10th Fibonacci polynomial evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020536() {
    super(new long[] {33554432, -22347776, 2968064, -92752, 682}, new long[] {55, 2378, 416020, 151693352, 70889062480L});
  }
}
