package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177727 <code>a(0)=1</code>; <code>a(n) = a(n-1) *</code> Fibonacci(3+n) * Fibonacci(1+n) / (Fibonacci(n))^2, <code>n &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A177727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177727() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {1, 3, 30, 180, 1300});
  }
}
