package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081057 E.g.f.: Sum_{n&gt;=0} a(n)*x^n/n! = {Sum_{n&gt;=0} F(n+1)*x^n/n!}^2, where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A081057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081057() {
    super(new long[] {-4, 2, 3}, new long[] {1, 2, 6});
  }
}
