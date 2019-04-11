package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273623 <code>a(n) =</code> Fibonacci(3*n) <code>- (2 +</code> (-1)^n)*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A273623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273623() {
    super(new long[] {1, 4, -4, -12, 4, 4}, new long[] {1, 5, 32, 135, 605, 2560});
  }
}
