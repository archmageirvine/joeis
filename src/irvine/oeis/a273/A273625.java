package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273625 a(n) = (1/12)*(Fibonacci(2*n) + Fibonacci(4*n) + Fibonacci(6*n)).
 * @author Sean A. Irvine
 */
public class A273625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273625() {
    super(new long[] {-1, 28, -204, 434, -204, 28}, new long[] {1, 14, 228, 3948, 69905, 1248072});
  }
}
