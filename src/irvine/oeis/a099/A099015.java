package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099015 a(n) = Fib(n+1)*(2*Fib(n)^2 + Fib(n)*Fib(n-1) + Fib(n-1)^2).
 * @author Sean A. Irvine
 */
public class A099015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099015() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, 2, 8, 33});
  }
}
