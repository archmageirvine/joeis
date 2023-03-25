package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224227 a(n) = (1/50)*((15*n^2-20*n+4)*Fibonacci(n) - (5*n^2-6*n)*A000032(n)).
 * @author Sean A. Irvine
 */
public class A224227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224227() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 0, 0, 1, 2, 7});
  }
}
