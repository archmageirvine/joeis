package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102312 <code>a(n) =</code> Fibonacci(5*n).
 * @author Sean A. Irvine
 */
public class A102312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102312() {
    super(new long[] {1, 11}, new long[] {0, 5});
  }
}
