package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273623 a(n) = Fibonacci(3*n) - (2 + (-1)^n)*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A273623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273623() {
    super(new long[] {1, 4, -4, -12, 4, 4}, new long[] {1, 5, 32, 135, 605, 2560});
  }
}
