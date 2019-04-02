package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292278 a(n) = (Fibonacci(3*n-1) + 1)/2 for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A292278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292278() {
    super(new long[] {-1, -3, 5}, new long[] {1, 3, 11});
  }
}
