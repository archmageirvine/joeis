package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093122 Jacobsthal(n)*Fibonacci(n+1).
 * @author Sean A. Irvine
 */
public class A093122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093122() {
    super(new long[] {-4, 2, 7, 1}, new long[] {0, 1, 2, 9});
  }
}
