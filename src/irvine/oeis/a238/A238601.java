package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238601 A sixth-order linear divisibility sequence related to the Fibonacci numbers: <code>a(n) </code>:= (1/10)*Fibonacci(3*n)*Fibonacci(5*n)/Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A238601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238601() {
    super(new long[] {1, 22, -250, -1320, 250, 22}, new long[] {1, 44, 1037, 32472, 915305, 26874892});
  }
}
