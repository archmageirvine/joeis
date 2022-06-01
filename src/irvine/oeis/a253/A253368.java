package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253368 a(n) = F(12*n)/(12^2) with the Fibonacci numbers F = A000045.
 * @author Sean A. Irvine
 */
public class A253368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253368() {
    super(new long[] {-1, 322}, new long[] {1, 322});
  }
}
