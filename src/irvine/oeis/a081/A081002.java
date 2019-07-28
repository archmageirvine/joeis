package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081002 <code>Fibonacci(4n)+1</code>, or <code>Fibonacci(2n-1)*Lucas(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A081002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081002() {
    super(new long[] {1, -8, 8}, new long[] {1, 4, 22});
  }
}
