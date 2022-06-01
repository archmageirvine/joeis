package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136429 a(n) = Sum_{k=0..n} F(k+1)^2*F(n-k+1)^2 where F = Fibonacci numbers (A000045).
 * @author Sean A. Irvine
 */
public class A136429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136429() {
    super(new long[] {-1, 4, 0, -10, 0, 4}, new long[] {1, 2, 9, 26, 84, 250});
  }
}
