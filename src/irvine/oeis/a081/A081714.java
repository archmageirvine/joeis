package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081714 <code>a(n) =</code> F(n)*L(n+1) where F=Fibonacci and L=Lucas numbers.
 * @author Sean A. Irvine
 */
public class A081714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081714() {
    super(new long[] {-1, 2, 2}, new long[] {0, 3, 4});
  }
}
