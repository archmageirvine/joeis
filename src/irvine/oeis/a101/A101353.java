package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101353 <code>a(n) =</code> Sum_{k=0..n} <code>(2^k + Fibonacci(k))</code>.
 * @author Sean A. Irvine
 */
public class A101353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101353() {
    super(new long[] {2, -1, -4, 4}, new long[] {1, 4, 9, 19});
  }
}
