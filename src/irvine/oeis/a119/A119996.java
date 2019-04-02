package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119996 Numerator of Sum_{k=1..n} 1/(Fibonacci(k)*Fibonacci(k+2)).
 * @author Sean A. Irvine
 */
public class A119996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119996() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 5, 14, 39});
  }
}
