package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081018 <code>a(n) = (Lucas(4n+1)-1)/5</code>, or <code>Fibonacci(2n)*Fibonacci(2n+1)</code>, or A081017(n)/5.
 * @author Sean A. Irvine
 */
public class A081018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081018() {
    super(new long[] {1, -8, 8}, new long[] {0, 2, 15});
  }
}
