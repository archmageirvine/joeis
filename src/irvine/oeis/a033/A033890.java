package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033890 <code>a(n) =</code> Fibonacci(4*n+2).
 * @author Sean A. Irvine
 */
public class A033890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033890() {
    super(new long[] {-1, 7}, new long[] {1, 8});
  }
}
