package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237654 G.f.: exp( Sum_{n&gt;=1} 5*Fibonacci(n-1)*Fibonacci(n+1) <code>* x^n/n )</code>.
 * @author Sean A. Irvine
 */
public class A237654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237654() {
    super(new long[] {-1, 0, 5, 5, 0}, new long[] {1, 0, 5, 5, 25});
  }
}
