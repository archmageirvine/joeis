package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255875 <code>a(n) =</code> Fibonacci(n+2) <code>+ n - 2</code>.
 * @author Sean A. Irvine
 */
public class A255875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255875() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 6, 10});
  }
}
