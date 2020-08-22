package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093129 Binomial transform of Fibonacci(2n-1) (A001519).
 * @author Sean A. Irvine
 */
public class A093129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093129() {
    super(new long[] {-5, 5}, new long[] {1, 2});
  }
}
