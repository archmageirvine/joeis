package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081011 <code>a(n) = Fibonacci(4n+3) + 2</code>, or <code>Fibonacci(2n+3)*Lucas(2n)</code>.
 * @author Sean A. Irvine
 */
public class A081011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081011() {
    super(new long[] {1, -8, 8}, new long[] {4, 15, 91});
  }
}
