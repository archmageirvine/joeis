package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127624 An 11th order Fibonacci sequence. <code>a(n) = a(n-1) + </code>... <code>+ a(n-11)</code>.
 * @author Sean A. Irvine
 */
public class A127624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127624() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
