package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099133 4^(n-1)*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A099133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099133() {
    super(new long[] {16, 4}, new long[] {0, 1});
  }
}
