package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093122 <code>Jacobsthal(n)*Fibonacci(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A093122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093122() {
    super(new long[] {-4, 2, 7, 1}, new long[] {0, 1, 2, 9});
  }
}
