package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035508 <code>a(n) =</code> Fibonacci(2n+2) <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A035508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035508() {
    super(new long[] {1, -4, 4}, new long[] {0, 2, 7});
  }
}
