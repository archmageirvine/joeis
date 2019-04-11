package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033887 <code>a(n) =</code> Fibonacci(3n+1).
 * @author Sean A. Irvine
 */
public class A033887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033887() {
    super(new long[] {1, 4}, new long[] {1, 3});
  }
}
